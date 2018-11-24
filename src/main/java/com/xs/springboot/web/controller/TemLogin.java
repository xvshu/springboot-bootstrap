package com.xs.springboot.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.xs.springboot.web.model.TemUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
@Controller
public class TemLogin {
    /**
     * 登陆
     * @return
     */
    @RequestMapping("/tem_login")
    public String login(){
        return "Tem_login";
    }

    /**
     * 登陆
     * @return
     */
    @RequestMapping(value="/tem_login/check",method= RequestMethod.POST)
    @ResponseBody
    public String checkuser(@RequestBody JSONObject params,HttpServletRequest request){
        String username=params.getString("username");
        String password=params.getString("password");
        System.out.println("username:"+String.valueOf(username));
        System.out.println("password:"+String.valueOf(password));
        String result="fai";
        if(password!=null&&
                password!=null&&
                username.equals(password)&&
                username.equals("admin")){

            TemUser user = new TemUser() ;
            user.setUserName("admin");
            request.getSession().setAttribute("user",user);

            result="suc";
        }
        return result;
    }

    /**
     * 登陆
     * @return
     */
    @RequestMapping(value="/tem_logout")
    public String logout(HttpServletRequest request){
        request.getSession().setAttribute("user",null);
        return login();
    }


}
