package com.hantele.demo.dao;

import com.hantele.demo.entity.Ret;

public interface RetMapper {
    int deleteByPrimaryKey(Integer retId);

    int insert(Ret record);

    int insertSelective(Ret record);

    Ret selectByPrimaryKey(Integer retId);

    int updateByPrimaryKeySelective(Ret record);

    int updateByPrimaryKey(Ret record);
}