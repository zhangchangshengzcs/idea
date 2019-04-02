package com.hgc;

import java.util.Stack;

/**
 * @author: zcs
 * @create: 2019/2/19 13:20
 **/
public class TestStack {
    public static void main(String[] args){
        System.out.println(getSame("aeabcsfadsfaed"));
    }
    public static int getSame(String str){
        Stack<Character> stack=new Stack<>();
        char[] array=str.toCharArray();
        if (str.equals("")){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            for (int j = 0; j < array.length; j++) {
                if (i!=j&&array[i]==array[j]){
                    stack.pop();
                    break;
                }
            }
        }
        if (stack.isEmpty()){
            return -1;
        }else {
            System.out.println(stack.firstElement());
            return str.indexOf(stack.firstElement()+"");
        }
    }

}
