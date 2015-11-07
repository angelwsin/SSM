package com.dao;

import org.springframework.stereotype.Repository;

import com.bean.LogTest;
@Repository
public interface LogTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogTest record);

    int insertSelective(LogTest record);

    LogTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogTest record);

    int updateByPrimaryKey(LogTest record);
}