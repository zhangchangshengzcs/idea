package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayStack<Integer> stack=new ArrayStack<>();
        for (int i=0;i<5;i++){
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
