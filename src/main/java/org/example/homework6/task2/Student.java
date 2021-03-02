package org.example.homework6.task2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Student {
    @SomeValue(someValue = 25)
    private int age;
    @SomeValue(someValue = 3)
    private int course;

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", course=" + course +
                '}';
    }

    public static void main(String[] args) throws Exception {
        Class<Student> studentClass = Student.class;
        Student student = studentClass.getConstructor().newInstance();
        Field fieldAge = Student.class.getDeclaredField("age");
        Field fieldCourse = Student.class.getDeclaredField("course");
        fieldAge.set(student, fieldAge.getAnnotation(SomeValue.class).someValue());
        fieldCourse.set(student, fieldCourse.getAnnotation(SomeValue.class).someValue());
        System.out.println(student);
    }
}


