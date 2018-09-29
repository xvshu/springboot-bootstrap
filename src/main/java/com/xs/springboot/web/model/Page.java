package com.xs.springboot.web.model;

import java.util.List;

/**
 * Created by Administrator on 2018/9/28 0028.
 */
public class Page {
    int pageSize;
    int pageNumber;
    int total;
    List rows;

    public Page(){

    }

    public Page(int pageSize,int pageNumber){
        this.pageSize=pageSize;
        this.pageNumber=pageNumber;
    }


    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public static Page getEmptyPage(int pageSize,int pageNumber){
        return new Page(pageSize,pageNumber);
    }

    public static Page getEmptyPage(){
        return new Page();
    }
}
