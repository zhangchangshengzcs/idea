package com.hgc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");//
        list.add("D");
//         for循环遍历里面可以删除计划的对象
         for (int i = 0; i < list.size(); i++) {// 0 1
         System.out.println(list.get(i));
         list.remove(2);
         }
    }
}
