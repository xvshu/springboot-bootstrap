package com.xs.springboot.web.simple;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/10/9 0009.
 */
public class Json {
    public static void main(String[] args) {
        costFastJson();
    }


    public static void costFastJson(){
        System.out.println("--------begin");
        String jsonStr = readTxt("D:\\Data\\json.txt");
        System.out.println("--------read txt over");

        List<DescribeData> array3 = JSON.parseArray(jsonStr,DescribeData.class);
//        List<DescribeData> array3 = jsonArray.toJavaList(DescribeData.class);
        System.out.println("--------array3:"+JSON.toJSONString(array3));

    }

    public static String readTxt(String filePath) {
        StringBuffer sb=new StringBuffer();
        try {
            File file = new File(filePath); 
            if(file.isFile() && file.exists()) {
                InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
                BufferedReader br = new BufferedReader(isr);
                String lineTxt = null;
                while ((lineTxt = br.readLine()) != null) {
                    sb.append(lineTxt);
                } 
                br.close(); 
            } else {
                System.out.println("文件不存在!"); 
            } 
        } catch (Exception e) { 
            System.out.println("文件读取错误!"); 
        }
        return sb.toString();
    }

    

    public static class DescribeData{
        JSONObject actions;
        JSONObject config;
        String api_name;
        String display_name;//中文名称
        Map<String,FieldData> fields;

        @JSONField(serialize=false)
        JSONObject sourceJson;//来源json

        public JSONObject getActions() {
            return actions;
        }

        public void setActions(JSONObject actions) {
            this.actions = actions;
        }

        public JSONObject getConfig() {
            return config;
        }

        public void setConfig(JSONObject config) {
            this.config = config;
        }

        public String getApi_name() {
            return api_name;
        }

        public void setApi_name(String api_name) {
            this.api_name = api_name;
        }

        public String getDisplay_name() {
            return display_name;
        }

        public void setDisplay_name(String display_name) {
            this.display_name = display_name;
        }

        public Map<String, FieldData> getFields() {
            return fields;
        }

        public void setFields(Map<String, FieldData> fields) {
            this.fields = fields;
        }

        public JSONObject getSourceJson() {
            return sourceJson;
        }

        public void setSourceJson(JSONObject sourceJson) {
            this.sourceJson = sourceJson;
        }
    }

    public static class FieldData{
        String label;//中文名称
        String type;//字段类型
        Boolean is_required; //是否必填
        String api_name;//字段apiName
        String target_api_name;//查找关联 目标apiName;
        String describe_api_name;//大部分情况没有值;
        List<FieldOption> options;//多选字段 todo 描述中给的是字符串
        String date_format;

        public void setIs_required(boolean is_required) {
            this.is_required = is_required;
        }
        public boolean getIs_required(){
            return this.is_required;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setIs_required(Boolean is_required) {
            this.is_required = is_required;
        }

        public String getApi_name() {
            return api_name;
        }

        public void setApi_name(String api_name) {
            this.api_name = api_name;
        }

        public String getTarget_api_name() {
            return target_api_name;
        }

        public void setTarget_api_name(String target_api_name) {
            this.target_api_name = target_api_name;
        }

        public String getDescribe_api_name() {
            return describe_api_name;
        }

        public void setDescribe_api_name(String describe_api_name) {
            this.describe_api_name = describe_api_name;
        }

        public List<FieldOption> getOptions() {
            return options;
        }

        public void setOptions(List<FieldOption> options) {
            this.options = options;
        }

        public String getDate_format() {
            return date_format;
        }

        public void setDate_format(String date_format) {
            this.date_format = date_format;
        }
    }

    public static class FieldOption{
        String label;
        Object value;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }



}



