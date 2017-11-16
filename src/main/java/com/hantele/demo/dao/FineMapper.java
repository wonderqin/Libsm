package com.hantele.demo.dao;

import com.hantele.demo.entity.Fine;

public interface FineMapper {
    int deleteByPrimaryKey(Integer fineid);

    int insert(Fine record);

    int insertSelective(Fine record);

    Fine selectByPrimaryKey(Integer fineid);

    int updateByPrimaryKeySelective(Fine record);

    int updateByPrimaryKey(Fine record);
}