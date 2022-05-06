package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Settings s1 = Settings.getInstance(5);
        Settings s2 = Settings.getInstance(6);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.durationTime);
        System.out.println(s2.durationTime);
        System.out.println(s2==s1);
    }
}
