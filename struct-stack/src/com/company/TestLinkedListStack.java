package com.company;

public class TestLinkedListStack {

    public static void main(String[] args) {
	// write your code here
        LinkedListStack<Integer> stack=new LinkedListStack<>();
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
