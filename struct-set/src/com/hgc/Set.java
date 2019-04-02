package com.hgc;

/**
 * @author: zcs
 * @create: 2019/3/4 11:56
 **/
public interface Set<E>{
    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();
}
