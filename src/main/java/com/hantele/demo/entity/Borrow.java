package com.hantele.demo.entity;

import java.util.Date;

public class Borrow {
    private Integer borrowId;

    private Date borrtime;

    private Date borrday;

    private Double borrbil;

    private Integer userid;

    private Integer bookid;

    private String state;

    public Borrow(Integer borrowId, Date borrtime, Date borrday, Double borrbil, Integer userid, Integer bookid, String state) {
        this.borrowId = borrowId;
        this.borrtime = borrtime;
        this.borrday = borrday;
        this.borrbil = borrbil;
        this.userid = userid;
        this.bookid = bookid;
        this.state = state;
    }

    public Borrow() {
        super();
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public Date getBorrtime() {
        return borrtime;
    }

    public void setBorrtime(Date borrtime) {
        this.borrtime = borrtime;
    }

    public Date getBorrday() {
        return borrday;
    }

    public void setBorrday(Date borrday) {
        this.borrday = borrday;
    }

    public Double getBorrbil() {
        return borrbil;
    }

    public void setBorrbil(Double borrbil) {
        this.borrbil = borrbil;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}