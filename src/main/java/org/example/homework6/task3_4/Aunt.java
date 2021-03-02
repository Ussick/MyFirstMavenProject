package org.example.homework6.task3_4;

import com.google.gson.annotations.Since;

@Since(2.0)
public class Aunt {
    private String name;

    public Aunt(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aunt{" +
                "name='" + name + '\'' +
                '}';
    }
}
