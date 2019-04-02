package com.hgc.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: zcs
 * @create: 2019/3/11 11:30
 **/
public class TestSet {
    public static void main(String[] args) {
        // set集合增加对象类型
        // ,无序、去除重复元素是调用对象的hashcode方法,如果对象的hashcode值一致，在调用对象的equals方法，
        // 只有当equals方法返回true的时候，set集合才认为是重复的元素
        Set<Book> set = new HashSet<Book>();// 创建一个HashSet对象
        set.add(new Book(45, "Java"));
        set.add(new Book(25, "C"));
        set.add(new Book(75, "Oracle"));
        set.add(new Book(41, "Html"));
        set.add(new Book(66, "Js"));
        set.add(new Book(12, "Css"));// 如果没有重写对象的hashcode方法，不能去除重复元素
        set.add(new Book(12, "Css"));
        set.add(new Book(12, "Css"));
        set.add(new Book(12, "Css"));
        // 遍历输出
        Iterator<Book> it = set.iterator();
        while (it.hasNext()) {// 只要迭代器有下一个对象
            Book book = it.next();// 获取到迭代器的下一个对象
            System.out.println(book.getId() + "\t" + book.getName());
        }

    }
}
