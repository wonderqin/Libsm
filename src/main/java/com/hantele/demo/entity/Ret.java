package com.hantele.demo.entity;

import java.util.Date;

public class Ret {
    private Integer retId;

    private String state;

    private Date outretdate;

    private Date actretdate;

    private String overdue;

    private Double outbil;

    private Double actbil;

    private Integer bookid;

    private Integer userid;

    public Ret(Integer retId, String state, Date outretdate, Date actretdate, String overdue, Double outbil, Double actbil, Integer bookid, Integer userid) {
        this.retId = retId;
        this.state = state;
        this.outretdate = outretdate;
        this.actretdate = actretdate;
        this.overdue = overdue;
        this.outbil = outbil;
        this.actbil = actbil;
        this.bookid = bookid;
        this.userid = userid;
    }

    public Ret() {
        super();
    }

    public Integer getRetId() {
        return retId;
    }

    public void setRetId(Integer retId) {
        this.retId = retId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getOutretdate() {
        return outretdate;
    }

    public void setOutretdate(Date outretdate) {
        this.outretdate = outretdate;
    }

    public Date getActretdate() {
        return actretdate;
    }

    public void setActretdate(Date actretdate) {
        this.actretdate = actretdate;
    }

    public String getOverdue() {
        return overdue;
    }

    public void setOverdue(String overdue) {
        this.overdue = overdue == null ? null : overdue.trim();
    }

    public Double getOutbil() {
        return outbil;
    }

    public void setOutbil(Double outbil) {
        this.outbil = outbil;
    }

    public Double getActbil() {
        return actbil;
    }

    public void setActbil(Double actbil) {
        this.actbil = actbil;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}