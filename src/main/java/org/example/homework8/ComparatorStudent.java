package org.example.homework8;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getAverageMark() == s2.getAverageMark()) {
            return s1.getName().compareTo(s2.getName());
        }
        return (int) (1000 * (-s1.getAverageMark() + s2.getAverageMark()));
    }
}
