package com.hantele.demo.dao;

import com.hantele.demo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findByUsernameAndPassword(@Param("username") String username, @Param("pwd") String pwd);

    int authorization(@Param("userId") Integer userId,@Param("identity") String identity);
}