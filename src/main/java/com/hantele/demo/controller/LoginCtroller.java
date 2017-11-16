package com.hantele.demo.controller;

import com.hantele.demo.dao.UserMapper;
import com.hantele.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.nio.file.attribute.UserPrincipal;

@Controller
@RequestMapping("/login")
public class LoginCtroller {

    //注入userMapper
    @Autowired
    private UserMapper userMapper;

    /**
     * index页面
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 测试是否能拿到数据库的数据
     */
    @RequestMapping("/test")
    public User test() {
        return userMapper.selectByPrimaryKey(1);
    }

   //登陆页面
    @RequestMapping("/login")
    public String login(){
        return "userLogin";
    }

    //注册页面
    @RequestMapping("/register")
    public String register01(){
        return "reg";
    }
    /**
     * 登陆方法
     */
    @RequestMapping("/userLogin")
    public String userLogin(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //为了在查询时获取到当前登录用户，在这里把登录用户存放在session中
        request.getSession().setAttribute("username",username);
        User users = userMapper.findByUsernameAndPassword(username,password);
        if(users != null){
            return "home";
        }else {
            return "reg";
        }
    }
    /**
     * 注册方法
     */
    @RequestMapping("/reg")
    public String register(HttpServletRequest request){
        String username = request.getParameter("username");
        String pwd1 = request.getParameter("pwd1");
        String pwd2 = request.getParameter("pwd2");
        String tel = request.getParameter("tel");
        String addr = request.getParameter("addr");
        if(pwd1.equals(pwd2)){
            User user = new User();
            user.setUsername(username);
            user.setPwd(pwd1);
            user.setAddr(addr);
            user.setTel(tel);
            System.out.println(username);
            userMapper.insert(user);
            return "userLogin";
        }else {
            return "reg";
        }
    }
}

