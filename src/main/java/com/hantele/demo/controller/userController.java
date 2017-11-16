package com.hantele.demo.controller;

import com.hantele.demo.dao.UserMapper;
import com.hantele.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    UserMapper userMapper;

    //查询个人信息
    @RequestMapping("/userInfo")
    public String listMyInfo(Model model){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        String username = (String)request.getSession().getAttribute("username");
        User users = userMapper.listUserInfoByName(username);
        model.addAttribute("userInfo",users);
        System.out.println(users.toString());
        return "user/userInfo";
    }

    //测试方法
    @RequestMapping("/test")
    public String test(){
        return "user/userInfo";
    }
}
