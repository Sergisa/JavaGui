package com.company;

import java.util.Objects;

public class Student {
    public int age;
    public int height;
    public String label;

    public Student(String label, int age, int height) {
        this.age = age;
        this.height = height;
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height);
    }


    @Override
    public String toString() {
        return "{" + label + ": " + height + "}";
    }
}
