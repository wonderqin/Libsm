package com.hantele.demo.service;

import com.hantele.demo.entity.Books;

import java.util.List;

public interface BookService {
    public List<Books> selectBookByCondition(String condition);

    public void addBook(Books books);

    public void deleteBook(String ids);
}
