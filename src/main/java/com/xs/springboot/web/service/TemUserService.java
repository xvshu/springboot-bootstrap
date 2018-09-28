package com.xs.springboot.web.service;

import com.xs.springboot.web.dao.TemUserMapper;
import com.xs.springboot.web.model.TemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/28 0028.
 */
@Service(value = "temUserService")
public class TemUserService {

    @Autowired
    TemUserMapper temUserMapper;

    public List<TemUser> getAll(){
        TemUser queryObj = new TemUser();
        return temUserMapper.queryByRecord(queryObj);
    }

}
