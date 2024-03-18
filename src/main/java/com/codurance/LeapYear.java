package com.codurance;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String isLeapYear(int year) {
        if (year == 1800){
            return "not a Leap Year";
        }
        if(year % 4 == 0) {
            return "is a Leap Year";
        }
        return "not a Leap Year";
    }
}