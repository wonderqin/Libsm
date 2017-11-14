package com.hantele.demo.entity;

public class Bookind {
    private Integer booklistId;

    private String listname;

    private Integer count;

    public Bookind(Integer booklistId, String listname, Integer count) {
        this.booklistId = booklistId;
        this.listname = listname;
        this.count = count;
    }

    public Bookind() {
        super();
    }

    public Integer getBooklistId() {
        return booklistId;
    }

    public void setBooklistId(Integer booklistId) {
        this.booklistId = booklistId;
    }

    public String getListname() {
        return listname;
    }

    public void setListname(String listname) {
        this.listname = listname == null ? null : listname.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}