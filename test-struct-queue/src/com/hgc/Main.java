package com.hgc;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<Integer> queue=new ArrayDeque<>();//数组队列
        for (int i = 0; i < 10; i++) {
            queue.add(i);//入队
            System.out.println(queue.toString());
            if(i%3==2){
                queue.remove();//出队
                System.out.println(queue.toString());
            }
        }
        System.out.println(queue.peek());//输出队首元素
    }
}
