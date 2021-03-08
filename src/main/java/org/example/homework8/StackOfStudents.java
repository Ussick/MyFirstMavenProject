package org.example.homework8;

import java.util.Stack;
import java.util.stream.Collectors;

public class StackOfStudents {
    public static void main(String[] args) {
        Stack<Student>studentStack=new Stack<>();
        studentStack.ensureCapacity(3);
        Student student1=new Student();
        student1.setName("Bill");
        student1.setAverageMark(3);
        Student student2=new Student();
        student2.setName("Jack");
        student2.setAverageMark(5);
        Student student3=new Student();
        student3.setName("Marry");
        student3.setAverageMark(4);
        Student student4=new Student();
        student4.setName("Chloe");
        student4.setAverageMark(3.3);
        studentStack.push(student1);
        studentStack.push(student2);
        studentStack.push(student3);
        studentStack.push(student4);
        System.out.println("Sorted output of studentStack. The stack remains unsorted:");
        studentStack.stream().sorted(new ComparatorStudent()).forEach(System.out::println);
        System.out.println();
        System.out.println("The original studentStack:");
        studentStack.stream().forEach(System.out::println);
        System.out.println();
        System.out.println("Method pop() realization:");
        while (!studentStack.empty()){
            System.out.println(studentStack.pop());
        }
    }
}
