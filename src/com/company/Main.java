package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "127.0.0.1";
        Pattern pattern = Pattern.compile("^(\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3})(:\\d{1,4})?$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        } else {

            System.out.println("OOps");
        }


        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
