package com.hantele.demo.controller;

import com.hantele.demo.dao.BookcountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class helloController {

    @Autowired
    private BookcountMapper bookcountMapper;

    @RequestMapping("/hello")
    public void hello() {
        System.out.println(bookcountMapper.selectByPrimaryKey(1).toString());

    }
}
