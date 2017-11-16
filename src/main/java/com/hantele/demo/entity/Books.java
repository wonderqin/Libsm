package com.hantele.demo.entity;

import java.util.Date;

public class Books {
    private Integer book_ID;

    private Integer bookList_ID;

    private String bookName;

    private String author;

    private String press;

    private Date pubTime;

    private Double price;

    private String state;

    private String ranges;

    private String resnum;

    public Books(Integer book_ID, Integer bookList_ID, String bookName, String author, String press, Date pubTime, Double price, String state, String ranges, String resnum) {
        this.book_ID = book_ID;
        this.bookList_ID = bookList_ID;
        this.bookName = bookName;
        this.author = author;
        this.press = press;
        this.pubTime = pubTime;
        this.price = price;
        this.state = state;
        this.ranges = ranges;
        this.resnum = resnum;
    }

    public Books() {
        super();
    }

    public Integer getbook_ID() {
        return book_ID;
    }

    public void setbook_ID(Integer book_ID) {
        this.book_ID = book_ID;
    }

    public Integer getbookList_ID() {
        return bookList_ID;
    }

    public void setbookList_ID(Integer bookList_ID) {
        this.bookList_ID = bookList_ID;
    }

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
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

    public Date getpubTime() {
        return pubTime;
    }

    public void setpubTime(Date pubTime) {
        this.pubTime = pubTime;
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

    @Override
    public String toString() {
        return "Books{" +
                "book_ID=" + book_ID +
                ", bookList_ID=" + bookList_ID +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", pubTime=" + pubTime +
                ", price=" + price +
                ", state='" + state + '\'' +
                ", ranges='" + ranges + '\'' +
                ", resnum='" + resnum + '\'' +
                '}';
    }
}