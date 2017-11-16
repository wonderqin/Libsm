package com.hantele.demo.dao;

import com.hantele.demo.entity.Bookcount;

public interface BookcountMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Bookcount record);

    int insertSelective(Bookcount record);

    Bookcount selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Bookcount record);

    int updateByPrimaryKey(Bookcount record);
}