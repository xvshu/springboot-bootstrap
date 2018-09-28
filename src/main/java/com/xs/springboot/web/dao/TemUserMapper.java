package com.xs.springboot.web.dao;

import com.xs.springboot.web.model.TemUser;

import java.util.List;

public interface TemUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(TemUser record);

    int insertSelective(TemUser record);

    TemUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TemUser record);

    int updateByPrimaryKey(TemUser record);

    List<TemUser> queryByRecord(TemUser record);
}