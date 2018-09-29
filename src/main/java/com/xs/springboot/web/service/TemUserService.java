package com.xs.springboot.web.service;

import com.xs.springboot.web.dao.TemUserMapper;
import com.xs.springboot.web.model.Page;
import com.xs.springboot.web.model.TemUser;
import org.apache.ibatis.annotations.Param;
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

    public Page getPage(Page page,TemUser searcheObj){
        List<TemUser> result= temUserMapper.pageByRecord(page,searcheObj);
        page.setRows(result);
        page.setTotal(temUserMapper.sizeByRecord(searcheObj));
        return page;
    }

    public int insertRecord(TemUser record){
        if(record!=null){
            return temUserMapper.insert(record);
        }else{
            return 0;
        }

    }

    public int deleteByIDS(List<Integer> ids){
        if(ids!=null && ids.size()>0){
            return temUserMapper.deleteByIDS(ids);
        }else{
            return 0;
        }
    }

}
