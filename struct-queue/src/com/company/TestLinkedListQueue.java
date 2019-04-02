package com.company;

/**
 * @author: zcs
 * @create: 2019/3/11 17:48
 **/
public class TestLinkedListQueue {
    public static void main(String[] args){
        LinkedListQueue<Integer> queue=new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i%3==2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
