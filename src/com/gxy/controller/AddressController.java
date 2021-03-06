package com.gxy.controller;

import com.alibaba.fastjson.JSONObject;
import com.gxy.entity.DangdangAddress;
import com.gxy.entity.DangdangUser;
import com.gxy.service.DangdangAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private DangdangAddressService dangdangAddressService;

    /**
     * 根据已登录ID查询数据库所对应的所有地址
     *
     * @param request
     * @return
     */
    @RequestMapping("/queryAddress")
    @ResponseBody
    public JSONObject queryAddress(HttpServletRequest request) {
        DangdangUser user = (DangdangUser) request.getSession().getAttribute("user");
        BigDecimal ddUserId = user.getDdUserId();
        List<DangdangAddress> dangdangAddress = dangdangAddressService.selectByDdUserId(ddUserId);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("addr", dangdangAddress);
        return jsonObject;
    }

    /**
     * 根据所选择的ID修改输入框中的地址
     *
     * @param request
     * @param addressId
     * @return
     */
    @RequestMapping("/addressChange")
    @ResponseBody
    public JSONObject addressChange(HttpServletRequest request, String addressId) {
        DangdangAddress dangdangAddress = dangdangAddressService.selectByAddressId(new BigDecimal(addressId)).get(0);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("addr", dangdangAddress);
        return jsonObject;
    }

    /**
     * 添加地址
     *
     * @param request
     * @param addressAdd
     * @param addressZipcode
     * @param addressMobile
     * @param addressReceiveName
     * @return
     */
    @RequestMapping("/insertAddress")
    @ResponseBody
    public boolean insertAddress(HttpServletRequest request, String addressAdd, String addressZipcode, String addressMobile, String addressReceiveName) {
        DangdangUser user = (DangdangUser) request.getSession().getAttribute("user");
        BigDecimal ddUserId = user.getDdUserId();
        DangdangAddress dangdangAddress = new DangdangAddress(addressReceiveName, addressAdd, addressMobile, addressZipcode, ddUserId);
        dangdangAddressService.insert(dangdangAddress);
        return true;
    }
}
