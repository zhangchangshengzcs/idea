package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* ArrayQueue<Integer> arrayQueue=new ArrayQueue<>();
        for (int i=0;i<10;i++){
            arrayQueue.enqueue(i);
            System.out.println(arrayQueue);
            if (i%3==2){
                arrayQueue.dequeue();
                System.out.println(arrayQueue);
            }
        }*/
       //测试2
        LoopQueue<Integer> loopQueue=new LoopQueue<>();
        for (int i=0;i<10;i++){
            loopQueue.enqueue(i);
            System.out.println(loopQueue);
            if (i%3==2){
                loopQueue.dequeue();
                System.out.println(loopQueue);
            }
        }
    }
}
