package com.xs.springboot.web.controller.tem;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xs.springboot.web.model.Page;
import com.xs.springboot.web.model.TemUser;
import com.xs.springboot.web.service.TemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
@Controller
public class TemGateWay {

    @RequestMapping(value="/tem_gateway")
    public String index( ){
        return "/tems/gateway/index";
    }


}
