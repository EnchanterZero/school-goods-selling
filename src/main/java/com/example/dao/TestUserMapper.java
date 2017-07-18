package com.example.dao;
import com.example.pojo.TestUser;


public interface TestUserMapper {
    int deleteByPrimaryKey(Long uId);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Long uId);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);
}