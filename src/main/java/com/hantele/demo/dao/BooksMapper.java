package com.hantele.demo.dao;

import com.hantele.demo.entity.Bookcount;
import com.hantele.demo.entity.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Books record);

    int insertSelective(Books record);

    Books selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Books record);

    int updateByPrimaryKey(Books record);

    List<Books> selectBookByCondition(@Param("condition") String condition);

    Bookcount selectBookcountByBookName(@Param("bookName") String bookName);

    int insertBooks(Books books);

    int deleteBook(@Param("id") int id);
}