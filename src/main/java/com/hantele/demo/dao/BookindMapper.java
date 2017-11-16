package com.hantele.demo.dao;

import com.hantele.demo.entity.Bookind;
import org.apache.ibatis.annotations.Param;

public interface BookindMapper {
    int deleteByPrimaryKey(Integer booklistId);

    int insert(Bookind record);

    int insertSelective(Bookind record);

    Bookind selectByPrimaryKey(Integer booklistId);

    int updateByPrimaryKeySelective(Bookind record);

    int updateByPrimaryKey(Bookind record);

    int IncreaseBookListCount(@Param("bookList_ID") int bookLIst_ID, @Param("number") int number);

    int DecreaseBookListCount(@Param("bookList_ID") int bookLIst_ID, @Param("number") int number);
}