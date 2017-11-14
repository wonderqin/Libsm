package com.hantele.demo.dao.impl;

import com.hantele.demo.entity.Pred;

public interface PredMapper {
    int deleteByPrimaryKey(Integer preId);

    int insert(Pred record);

    int insertSelective(Pred record);

    Pred selectByPrimaryKey(Integer preId);

    int updateByPrimaryKeySelective(Pred record);

    int updateByPrimaryKey(Pred record);
}