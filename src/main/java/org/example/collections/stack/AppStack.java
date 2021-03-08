package org.example.collections.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class AppStack {

    private static void stack() {
        Stack<String> stack=new Stack<>();
        stack.push("one");
        stack.push("two");
        stack.add("three");
        stack.forEach(x-> System.out.println(stack.peek()));

        while (!stack.empty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }

    public static void main(String[] args) {
        //stack();

        LinkedList<Integer> integers=new LinkedList<>();
        integers.addFirst(3);
        integers.addFirst(2);
        integers.addFirst(1);
        integers.addFirst(0);
        integers.forEach(System.out::println);
        integers.add(3,5);
        integers.addLast(10);
        System.out.println("!!!!!!!!!!");
        integers.forEach(System.out::println);

//        while (!integers.isEmpty()){
//            System.out.println(integers.pop());
//        }
    }
}
