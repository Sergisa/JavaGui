package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<String> stringList;

    public static void main(String[] args) {

        try {
            System.out.println(stringList.add("5"));
        }catch(NullPointerException mySuperPuperException){
            mySuperPuperException.printStackTrace();
            System.out.println("ACHTUNG WARNING");
        }

        try {
            System.out.println(division(4, 0));
        }catch (Exception e){
            e.printStackTrace();
        }
        readFile("src/text.txt");
    }

    static double division(double a, double b) throws Exception {
        if(b==0) throw new Exception("Вы попытались поделить на ноль - вы редиска");
        return a / b;
    }

    static void readFile(String fileName){
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Файл занят");
            e.printStackTrace();
        }
    }
}
