package com.practice4.task3;

public class FindNumber {

    public static Double toFind(String s) {
        try {
            return Double.parseDouble(s);
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(FindNumber.toFind("25f"));
    }
}
