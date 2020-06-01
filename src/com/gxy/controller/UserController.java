package com.gxy.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.gxy.entity.DangdangUser;
import com.gxy.service.DangdangUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DangdangUserService dangdangUserService;

    @Autowired
    private Producer captchaProducer;

    /**
     * 设置验证码
     *
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping("/validateCode")
    @ResponseBody
    public ModelAndView validateCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setDateHeader("Expires", 0);
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");
        // return a jpeg
        response.setContentType("image/jpeg");
        // create the text for the image
        String capText = captchaProducer.createText();
        System.out.println(capText);
        // store the text in the session
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
        // create the image with the text
        BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        // write the data out
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
        return null;
    }

    /**
     * 登录
     *
     * @param request
     * @param ddUserEmail
     * @param ddUserPassword
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request, String ddUserEmail, String ddUserPassword) {
        List<DangdangUser> dangdangUsers = dangdangUserService.selectByDdUserEmailAndDdUserPassword(ddUserEmail, ddUserPassword);
        String result = dangdangUsers.size() > 0 ? "true" : "false";
        if (result.equals("true")) request.getSession().setAttribute("user", dangdangUsers.get(0));
        return result;
    }

    /**
     * 注册
     *
     * @param request
     * @param verifyCode
     * @param ddUserEmail
     * @param ddUserNickName
     * @param ddUserPassword
     * @return
     */
    @RequestMapping("/registUser")
    @ResponseBody
    public boolean registUser(HttpServletRequest request, String verifyCode, String ddUserEmail, String ddUserNickName, String ddUserPassword) {
        HttpSession session = request.getSession();
        String currentCode = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if (currentCode.equals(verifyCode)) {
            DangdangUser dangdangUser = new DangdangUser();
            dangdangUser.setDdUserNickName(ddUserNickName);
            dangdangUser.setDdUserEmail(ddUserEmail);
            dangdangUser.setDdUserPassword(ddUserPassword);
            System.out.println(dangdangUser);
            session.setAttribute("registUser", dangdangUser);
            return true;
        }
        return false;
    }

    /**
     * 添加用户
     *
     * @param request
     * @return
     */
    @RequestMapping("/insertUser")
    @ResponseBody
    public boolean insertUser(HttpServletRequest request) {
        DangdangUser registUser = (DangdangUser) request.getSession().getAttribute("registUser");
        dangdangUserService.insert(registUser);
        return true;
    }

    /**
     * 注销
     *
     * @param request
     * @return
     */
    @RequestMapping("/clearSessionUser")
    public String clearSessionUser(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/user/login.jsp";
    }

}
