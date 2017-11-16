package com.hantele.demo.dao;

import com.hantele.demo.entity.Bookcount;
import org.apache.ibatis.annotations.Param;

public interface BookcountMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Bookcount record);

    int insertSelective(Bookcount record);

    Bookcount selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Bookcount record);

    int updateByPrimaryKey(Bookcount record);

    int IncreaseBookCount(@Param("bookName") String bookName, @Param("number") int number);

    int DecreaseBookCount(@Param("bookName") String bookName, @Param("number") int number);
}