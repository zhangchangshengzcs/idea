package com.hgc.treeset;
import java.util.TreeSet;

/**
 * @author: zcs
 * @create: 2019/3/11 12:01
 **/
public class TestTreeSet {
    public static void main(String[] args) {
        // TreeSet增加对象类型
        TreeSet<Book> set = new TreeSet<Book>();// Book对象必须要实现java.lang.Comparable接口
        set.add(new Book(23, "java", 45));
        set.add(new Book(123, "C", 15));
        set.add(new Book(53, "C#", 31));
        set.add(new Book(83, "Oracle", 245));
        set.add(new Book(43, "sql", 25));
        set.add(new Book(213, "Html", 5));
        set.add(new Book(43, "sql", 25));
        set.add(new Book(43, "sql", 25));
        // ///
        for (Book book : set) {
            System.out.println(book.getId() + "\t" + book.getName() + "\t"
                    + book.getPrice());
        }

    }
}
