package com.xs.springboot.web.dao;

import com.xs.springboot.web.model.Page;
import com.xs.springboot.web.model.TemUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TemUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(TemUser record);

    int insertSelective(TemUser record);

    TemUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(TemUser record);

    int updateByPrimaryKey(TemUser record);

    List<TemUser> queryByRecord(TemUser record);

    int sizeByRecord(TemUser record);

    List<TemUser> pageByRecord(@Param("page")Page page, @Param("record")TemUser record);

    int deleteByIDS(@Param("ids")List<Integer> ids);
}