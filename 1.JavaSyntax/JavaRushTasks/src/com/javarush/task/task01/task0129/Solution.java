package com.javarush.task.task01.task0129;

public class Solution {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double Pi = 3.14;
        System.out.println( 2 * Pi * radius );
    }
}
