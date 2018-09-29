package com.xs.springboot.web.controller.tem;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xs.springboot.web.model.Page;
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
    private Page ajaxGetSellRecord(@RequestBody JSONObject jsonObject) {

        //得到客户端传递的页码和每页记录数，并转换成int类型
        int pageSize = jsonObject.getInteger("pageSize");
        int pageNumber = jsonObject.getInteger("pageNumber");
        String orderNum = jsonObject.getString("orderNum");
        System.out.println("pageSize:"+pageSize);
        System.out.println("pageNumber:"+pageNumber);
        System.out.println("orderNum:"+orderNum);
        Page page = Page.getEmptyPage(pageSize,pageNumber);
        JSONObject json= new JSONObject();
        TemUser record = new TemUser();
        page = temUserService.getPage(page,record);
        return page;
    }

    @RequestMapping(value="/tem_user/add",method= RequestMethod.POST)
    private  @ResponseBody Boolean ajaxAddRecord(TemUser temUser) {
//        TemUser temUser=(TemUser)JSON.parse(JSON.toJSONString(jsonObject));
        System.out.println("temUser:"+JSON.toJSONString(temUser));
        int result = temUserService.insertRecord(temUser);
        Boolean issuccess=false;
        if(result==1){
            issuccess=true;
        }
        return issuccess;
    }

    @RequestMapping(value="/tem_user/delete",method= RequestMethod.POST)
    @ResponseBody
    private  Boolean ajaxDeleteRecord(@RequestBody List<Integer> list) {
        System.out.println("userIDS:"+JSON.toJSONString(list));
        int result = temUserService.deleteByIDS(list);
        Boolean issuccess=false;
        if(result>=1){
            issuccess=true;
        }
        return issuccess;
    }

}
