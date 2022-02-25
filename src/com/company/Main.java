package com.company;

import com.formdev.flatlaf.FlatDarculaLaf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FlatDarculaLaf.install();

        String[] stringArray = new String[]{"One", "Two", "Three"};

        //List<String> stringList = new ArrayList<>();
        //stringList.addAll(Arrays.asList(stringArray));
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));
        stringList.add("Four");
        stringList.add("Five");
        stringList.add("Six Seven Eight");

        MainForm form = new MainForm();
        form.setData(stringList);

        System.out.println("Six Seven Eight".contains("Six"));
        System.out.println(stringList);
    }
}
