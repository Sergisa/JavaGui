package com.company;

import com.formdev.flatlaf.FlatDarculaLaf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static String a = "hello";
    public static String b = "hellagfhs";


    public static void main(String[] args) {
        FlatDarculaLaf.install();
        Student sergey = new Student("sergey", 4, 8);
        Student sofya = new Student("sofya", 5, 1);
        Student john = new Student("john", 5, 3);
        Student anton = new Student("anton", 5, 2);

        String[] stringArray = new String[]{"One", "Two", "Three"};
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        stringList.add("Four");
        stringList.add("Five");
        stringList.add("Six Seven Eight");

        List<Student> studentList = new ArrayList<>(Arrays.asList(sergey, sofya, john, anton));
        System.out.println(studentList);
        List<Student> sortedStudentList = studentList.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                System.out.print(o1);
                System.out.print(" | ");
                System.out.print(o2);
                System.out.println(" -> " + (o2.height - o1.height));
                return o2.height - o1.height;
            }
        }).collect(Collectors.toList());
        System.out.println(sortedStudentList);

        System.out.println(stringList);
        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);


    }
}
