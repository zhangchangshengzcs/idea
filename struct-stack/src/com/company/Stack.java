package com.company;

public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void  push(E e);
    E pop();//出栈
    E peek();//栈顶元素
}
