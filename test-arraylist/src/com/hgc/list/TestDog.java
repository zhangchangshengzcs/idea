package com.hgc.list;

import com.hgc.list.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: zcs
 * @create: 2019/3/11 11:13
 **/
public class TestDog {
    public static void main(String[] args) {
        // list排序
        List<Dog> list = new ArrayList<Dog>();
        list.add(new Dog(1, "AAA"));
        list.add(new Dog(31, "TTTT"));
        list.add(new Dog(2, "yyyy"));
        list.add(new Dog(88, "eeee"));
        list.add(new Dog(12, "rr"));
        System.out.println("没有排序是:");
        print(list);
        Collections.sort(list);// 排序,前台是list里面的对象要实现Comparable
        System.out.println("=================");
        System.out.println("排序之后是:");
        print(list);

    }

    public static void print(List<Dog> list) {
        for (Dog dog : list) {
            System.out.println(dog.getId() + "==" + dog.getName());
        }
    }

}
