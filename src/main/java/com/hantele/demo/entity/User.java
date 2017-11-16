package com.hantele.demo.entity;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

public class User {
    private Integer userId;

    @NotNull(message = "用户名不能为空！")
    @Length(min = 3,message = "用户名长度最低为3")
    private String username;

    @NotNull(message = "密码不能为空！")
    @Length(max = 16,message = "密码长度最长为16位")
    private String pwd;

    private String identity;

    private String tel;

    private String addr;

    public User(Integer userId, String username, String pwd, String identity, String tel, String addr) {
        this.userId = userId;
        this.username = username;
        this.pwd = pwd;
        this.identity = identity;
        this.tel = tel;
        this.addr = addr;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", identity='" + identity + '\'' +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}