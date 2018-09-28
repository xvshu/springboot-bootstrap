package com.xs.springboot.web.controller.tem;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xs.springboot.web.model.TemUser;
import com.xs.springboot.web.service.TemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
@Controller
public class TemUserController {

    @Autowired
    TemUserService temUserService;

    @RequestMapping(value="/tem_user")
    public String index( ){
        return "/tems/manager/tem_user";
    }

//    @RequestMapping(value="/tem_user/getall",method= RequestMethod.POST)
//    @ResponseBody
//    public JSONObject getAll(@RequestParam(value="limit",required = false)Integer limit,
//                                @RequestParam(value="offset",required = false)Integer offset,
//                                @RequestParam(value="search",required = false)String search
//                                ){
//        JSONObject json= new JSONObject();
//        List<TemUser> allUser = temUserService.getAll();
//        json.put("rows",allUser);
//        json.put("total",allUser.size());
//        return json;
//    }

    @RequestMapping(value="/tem_user/getall",method= RequestMethod.POST)
    @ResponseBody
    private JSONObject ajaxGetSellRecord(@RequestBody JSONObject jsonObject) {

        //得到客户端传递的页码和每页记录数，并转换成int类型
        int pageSize = jsonObject.getInteger("pageSize");
        int pageNumber = jsonObject.getInteger("pageNumber");
        String orderNum = jsonObject.getString("orderNum");
        System.out.println("pageSize:"+pageSize);
        System.out.println("pageNumber:"+pageNumber);
        System.out.println("orderNum:"+orderNum);
        JSONObject json= new JSONObject();
        List<TemUser> allUser = temUserService.getAll();
        json.put("rows",allUser);
        json.put("total",allUser.size());
        return json;
    }

}
