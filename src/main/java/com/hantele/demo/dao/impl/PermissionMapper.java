package com.hantele.demo.dao.impl;

import com.hantele.demo.entity.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer autId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer autId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}