package com.hgc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: zcs
 * @create: 2019/1/22 17:20
 **/
public class TestList {
    public static void main(String[] args) {
        // list集合排序
        List<Integer> list = new ArrayList<Integer>();
        list.add(34);
        list.add(134);
        list.add(234);
        list.add(14);
        list.add(4);
        list.add(67);
        System.out.println("没有排序之前是:");
        print(list);
        Collections.sort(list);//排序
        System.out.println("排序之后是:");
        print(list);

    }
    public static void print(List list) {
        for (Object o : list) {
            System.out.println(o);
        }

    }


}
