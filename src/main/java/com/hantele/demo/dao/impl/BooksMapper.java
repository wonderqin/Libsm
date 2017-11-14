package com.hantele.demo.dao.impl;

import com.hantele.demo.entity.Books;

public interface BooksMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Books record);

    int insertSelective(Books record);

    Books selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Books record);

    int updateByPrimaryKey(Books record);
}