package com.xs.springboot.web.interceptors;

import com.xs.springboot.web.model.TemUser;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/10/9 0009.
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    List<String> listPostUrls = Arrays.asList("static","gateway","login","logout","css","js","bootstrap","font-awesome","fonts","ico","img");;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {


        String url = request.getRequestURI();
        for(String onepass:listPostUrls){
            if(url.indexOf(onepass)>=0){
                return true;
            }
        }
        TemUser user = (TemUser) request.getSession().getAttribute("user");
        if (user == null) {
            response.sendRedirect("/tem_login");
            return false;
        }
        return true;
    }

}
