package com.hantele.demo.controller;

import com.hantele.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/permission")
public class PermissionCtroller {

    @Autowired
    UserMapper userMapper;

    //授权页面
    @RequestMapping("atrzt")
    public String atrzt(){
        return "authorization/authorization";
    }
    //授权方法
    @RequestMapping("/authorization")
    public String authorization(HttpServletRequest request){
        String identity = request.getParameter("auth");
        String userId = request.getParameter("userId");
        System.out.println(identity);
        int userid = Integer.parseInt(userId);
        userMapper.authorization(userid,identity);
        return "authorization/success";
    }
}
