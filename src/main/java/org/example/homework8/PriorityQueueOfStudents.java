package org.example.homework8;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.IntFunction;

public class PriorityQueueOfStudents {
    public static void main(String[] args) {
        Queue<Student> studentQueue = new PriorityQueue<>(new ComparatorStudent());
        Student student1 = new Student();
        student1.setName("Bill");
        student1.setAverageMark(3);
        Student student2 = new Student();
        student2.setName("Jack");
        student2.setAverageMark(5);
        Student student3 = new Student();
        student3.setName("Marry");
        student3.setAverageMark(4);
        Student student4 = new Student();
        student4.setName("Chloe");
        student4.setAverageMark(3.3);
        studentQueue.offer(student1);
        studentQueue.offer(student2);
        studentQueue.offer(student3);
        studentQueue.offer(student4);
        Student[] students = new Student[studentQueue.stream().toArray().length];
        int i = 0;
        while (!studentQueue.isEmpty()) {
            students[i] = studentQueue.poll();
            i++;
        }
        Arrays.stream(students).forEach(System.out::println);
    }
}
