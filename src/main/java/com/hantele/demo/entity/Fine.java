package com.hantele.demo.entity;

import java.util.Date;

public class Fine {
    private Integer fineid;

    private Double finegole;

    private Date borrdate;

    private Date deadline;

    private Date actretday;

    private String state;

    private Integer userid;

    private Integer bookid;

    public Fine(Integer fineid, Double finegole, Date borrdate, Date deadline, Date actretday, String state, Integer userid, Integer bookid) {
        this.fineid = fineid;
        this.finegole = finegole;
        this.borrdate = borrdate;
        this.deadline = deadline;
        this.actretday = actretday;
        this.state = state;
        this.userid = userid;
        this.bookid = bookid;
    }

    public Fine() {
        super();
    }

    public Integer getFineid() {
        return fineid;
    }

    public void setFineid(Integer fineid) {
        this.fineid = fineid;
    }

    public Double getFinegole() {
        return finegole;
    }

    public void setFinegole(Double finegole) {
        this.finegole = finegole;
    }

    public Date getBorrdate() {
        return borrdate;
    }

    public void setBorrdate(Date borrdate) {
        this.borrdate = borrdate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getActretday() {
        return actretday;
    }

    public void setActretday(Date actretday) {
        this.actretday = actretday;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
}