package com.jyx.vip.web.handler;

import com.jyx.vip.entity.UserEntity;
import com.jyx.vip.funcation.UserFuncation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author:jyx
 * @date:2019-05-29 15:35
 * @desc(描述):
 */
@Controller
public class LoginHandler {

    @Autowired
    UserFuncation userFuncation;

    @RequestMapping(method = RequestMethod.POST, path = "/login.do")
    public String login(String account, String password, HttpServletRequest httpServletRequest) {
        try {
            UserEntity login = userFuncation.login(account, password);
            httpServletRequest.getSession().setAttribute("currentUser", login);
        } catch (Exception e) {
            httpServletRequest.setAttribute("message", e.getMessage());
            return "forward:/login.jsp";
        }
        return "redirect:/index.do";
    }

    @RequestMapping("/index.do")
    public String index() {
        return "/index";
    }
}
