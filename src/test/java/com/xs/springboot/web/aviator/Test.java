package com.xs.springboot.web.aviator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

/**
 * Created by Administrator on 2018/11/19 0019.
 */
public class Test {

    public static void main(String[] args) {
        String expression = " Y/n+(1-(k-1)/n)*Y*(i/n)";

        // 编译表达式
        Expression compiledExp = AviatorEvaluator.compile(expression);

        Map<String, Object> env = new HashMap<String, Object>();
        env.put("Y", 10000);
        env.put("n", 2);
        env.put("k", 1);
        env.put("i", 0.12);

        // 执行表达式
        Double result = (Double) compiledExp.execute(env);
        System.out.println(result);
    }


}
