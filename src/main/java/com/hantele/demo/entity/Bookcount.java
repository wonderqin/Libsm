package com.hantele.demo.entity;

public class Bookcount {
    private Integer cid;

    private String bookname;

    private Integer count;

    public Bookcount(Integer cid, String bookname, Integer count) {
        this.cid = cid;
        this.bookname = bookname;
        this.count = count;
    }

    public Bookcount() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}