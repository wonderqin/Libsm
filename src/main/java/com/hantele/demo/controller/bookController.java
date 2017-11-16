package com.hantele.demo.controller;

import com.hantele.demo.entity.Books;
import com.hantele.demo.serviceimpl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/book")
public class bookController {
    @Autowired
    private BookServiceImpl bookServiceImpl;

    //按书名、作者、出版社查找图书
    @RequestMapping("/selectBookByCondition")
    public List<Books> selectBookByCondition(@RequestParam("condition") String condition) {
        return bookServiceImpl.selectBookByCondition(condition);
    }

    //增加图书
    @RequestMapping("/addBook")
    public void addBook(@ModelAttribute Books books) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse("2015-12-12");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Books books1 = new Books();
        books1.setbookList_ID(1);
        books1.setbookName("哥德巴赫猜想");
        books1.setAuthor("徐迟");
        books1.setPress("人民文学出版社");
        books1.setpubTime(date);
        books1.setPrice(67D);
        books1.setState("1");
        books1.setRanges("1");
        books1.setResnum("B-006");
        bookServiceImpl.addBook(books1);
    }

    //批量删除图书
    @RequestMapping("/deleteBook")
    public void deleteBook(@RequestParam("ids") String ids) {
        bookServiceImpl.deleteBook(ids);
    }
}
