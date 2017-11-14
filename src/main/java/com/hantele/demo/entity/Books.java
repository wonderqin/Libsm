package com.hantele.demo.entity;

import java.util.Date;

public class Books {
    private Integer bookId;

    private Integer booklistId;

    private String bookname;

    private String author;

    private String press;

    private Date pubtime;

    private Double price;

    private String state;

    private String ranges;

    private String resnum;

    public Books(Integer bookId, Integer booklistId, String bookname, String author, String press, Date pubtime, Double price, String state, String ranges, String resnum) {
        this.bookId = bookId;
        this.booklistId = booklistId;
        this.bookname = bookname;
        this.author = author;
        this.press = press;
        this.pubtime = pubtime;
        this.price = price;
        this.state = state;
        this.ranges = ranges;
        this.resnum = resnum;
    }

    public Books() {
        super();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBooklistId() {
        return booklistId;
    }

    public void setBooklistId(Integer booklistId) {
        this.booklistId = booklistId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }

    public Date getPubtime() {
        return pubtime;
    }

    public void setPubtime(Date pubtime) {
        this.pubtime = pubtime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRanges() {
        return ranges;
    }

    public void setRanges(String ranges) {
        this.ranges = ranges == null ? null : ranges.trim();
    }

    public String getResnum() {
        return resnum;
    }

    public void setResnum(String resnum) {
        this.resnum = resnum == null ? null : resnum.trim();
    }
}