package com.hgc;

import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: zcs
 * @create: 2019/1/25 10:57
 * @description: 测试正则表达式
 **/
public class Test2 {
    public static void main(String[] args) {
        // write your code here
//        Queue<Integer> loopQueue=new arr
        Pattern pattern=Pattern.compile("[A-Za-z,]+");
        Matcher isTypeCode=pattern.matcher("fileType1,indexType");
        System.out.println(isTypeCode.matches());
    }
}
