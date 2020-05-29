package com.gxy.service.impl;

import com.gxy.util.MD5;
import com.gxy.util.RandomCharecters;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

import com.gxy.dao.DangdangUserMapper;
import com.gxy.entity.DangdangUser;
import com.gxy.service.DangdangUserService;

@Service
public class DangdangUserServiceImpl implements DangdangUserService {

    @Resource
    private DangdangUserMapper dangdangUserMapper;


    @Override
    public int insert(DangdangUser dangdangUser) {
        String salt = RandomCharecters.getRandomString(4);
        String password = salt + dangdangUser.getDdUserPassword();
        String md5Digest = MD5.getMD5Digest(password);
        dangdangUser.setDdUserSalt(salt);
        dangdangUser.setDdUserPassword(md5Digest);
        return dangdangUserMapper.insert(dangdangUser);
    }

    @Override
    public List<DangdangUser> selectByDdUserEmailAndDdUserPassword(String ddUserEmail, String ddUserPassword) {
        String salt = dangdangUserMapper.selectDdUserSaltByDdUserEmail(ddUserEmail);
        ddUserPassword = MD5.getMD5Digest(salt + ddUserPassword);
        return dangdangUserMapper.selectByDdUserEmailAndDdUserPassword(ddUserEmail, ddUserPassword);
    }


    public String selectDdUserSaltByDdUserEmail(String ddUserEmail) {
        return dangdangUserMapper.selectDdUserSaltByDdUserEmail(ddUserEmail);
    }
}
