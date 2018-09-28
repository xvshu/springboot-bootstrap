package com.xs.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
@Controller
public class TemIndex {
    /**
     * 登陆
     * @return
     */
    @RequestMapping("/tem_index")
    public String index(){
        return "Tem_index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "com/welcome";
    }

}
