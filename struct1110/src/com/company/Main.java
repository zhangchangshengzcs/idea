package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        int[] scores=new int[]{100,99,66};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (int score :
                scores) {
            System.out.println(score);
        }*/
        Array<Integer> array=new Array<>(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);
        array.add(2,18);
        System.out.println(array);
        array.addFirst(-1);
        System.out.println(array);
        array.remove(2);
        //自动提示输出语句:sout
        System.out.println(array);
        array.removeElement(6);
        System.out.println(array);
        array.removeFirst();
        System.out.println(array);
    }
}
