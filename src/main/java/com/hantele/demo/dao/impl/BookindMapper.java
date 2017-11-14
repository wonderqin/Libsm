package com.hantele.demo.dao.impl;

import com.hantele.demo.entity.Bookind;

public interface BookindMapper {
    int deleteByPrimaryKey(Integer booklistId);

    int insert(Bookind record);

    int insertSelective(Bookind record);

    Bookind selectByPrimaryKey(Integer booklistId);

    int updateByPrimaryKeySelective(Bookind record);

    int updateByPrimaryKey(Bookind record);
}