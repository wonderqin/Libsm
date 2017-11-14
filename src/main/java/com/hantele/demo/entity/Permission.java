package com.hantele.demo.entity;

public class Permission {
    private Integer autId;

    private Integer userId;

    private String autname;

    private Integer autgrade;

    public Permission(Integer autId, Integer userId, String autname, Integer autgrade) {
        this.autId = autId;
        this.userId = userId;
        this.autname = autname;
        this.autgrade = autgrade;
    }

    public Permission() {
        super();
    }

    public Integer getAutId() {
        return autId;
    }

    public void setAutId(Integer autId) {
        this.autId = autId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAutname() {
        return autname;
    }

    public void setAutname(String autname) {
        this.autname = autname == null ? null : autname.trim();
    }

    public Integer getAutgrade() {
        return autgrade;
    }

    public void setAutgrade(Integer autgrade) {
        this.autgrade = autgrade;
    }
}