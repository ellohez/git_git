package com.ellohez;

public class Main {
    public static void main(String[] args) {

        System.out.println("Feature 3 branch");
       // System.out.println("Main branch");
        System.out.println("Hello world!");

        Feature_3 obj = new Feature_3();
        obj.setTest_class(2);
        System.out.println(obj.getTest_class());
    }
}