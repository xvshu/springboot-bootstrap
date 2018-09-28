package com.xs.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
@Controller
public class TemCommon {
    /**
     * 登陆
     * @return
     */
    @RequestMapping("/toht/{url}")
    public String tohtml(String url){
        return url;
    }

}
