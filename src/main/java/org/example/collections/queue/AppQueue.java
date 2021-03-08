package org.example.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class AppQueue {
    public static void main(String[] args) {
        Queue<String> stringQueue=new LinkedList<>();
        stringQueue.add("head");
        stringQueue.add("B");
        stringQueue.add("C");
        stringQueue.add("D");
        stringQueue.offer("A");
        System.out.println(stringQueue.element());

        while (!stringQueue.isEmpty()){
            System.out.println(stringQueue.poll());
        }
        System.out.println(stringQueue);
    }
}
