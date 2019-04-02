package com.hgc.list;

/**
 * @author: zcs
 * @create: 2019/3/11 10:06
 **/
public class Dog implements Comparable<Dog>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Dog() {
        super();
    }

    @Override
    public int compareTo(Dog o) {
        if (this.id < o.getId()) {
            return -1;// 返回-1，2个相邻的对象交换顺序
        }
        return 0;
    }
}
