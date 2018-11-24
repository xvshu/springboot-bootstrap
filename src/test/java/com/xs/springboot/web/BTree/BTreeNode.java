package com.xs.springboot.web.BTree;

/**
 * Created by Administrator on 2018/11/5 0005.
 */
public class BTreeNode {



    public int leftvalue;
    public int rightvalue;

    public BTreeNode leftnote;
    public BTreeNode midnote;
    public BTreeNode rightnote;

    public void addvalue(int value){
        if(leftvalue==value ||rightvalue==value ){
            return ;
        }
        BTreeNode doNote;
        if(value<leftvalue){

        }else if(value>leftvalue && value<rightvalue){

        }else if(value>rightvalue){

        }
    }

}
