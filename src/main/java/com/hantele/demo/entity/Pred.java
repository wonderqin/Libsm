package com.hantele.demo.entity;

import java.util.Date;

public class Pred {
    private Integer preId;

    private Date predate;

    private String prestate;

    private Date predatetime;

    private Date predictdate;

    private Integer userid;

    private Integer bookid;

    public Pred(Integer preId, Date predate, String prestate, Date predatetime, Date predictdate, Integer userid, Integer bookid) {
        this.preId = preId;
        this.predate = predate;
        this.prestate = prestate;
        this.predatetime = predatetime;
        this.predictdate = predictdate;
        this.userid = userid;
        this.bookid = bookid;
    }

    public Pred() {
        super();
    }

    public Integer getPreId() {
        return preId;
    }

    public void setPreId(Integer preId) {
        this.preId = preId;
    }

    public Date getPredate() {
        return predate;
    }

    public void setPredate(Date predate) {
        this.predate = predate;
    }

    public String getPrestate() {
        return prestate;
    }

    public void setPrestate(String prestate) {
        this.prestate = prestate == null ? null : prestate.trim();
    }

    public Date getPredatetime() {
        return predatetime;
    }

    public void setPredatetime(Date predatetime) {
        this.predatetime = predatetime;
    }

    public Date getPredictdate() {
        return predictdate;
    }

    public void setPredictdate(Date predictdate) {
        this.predictdate = predictdate;
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