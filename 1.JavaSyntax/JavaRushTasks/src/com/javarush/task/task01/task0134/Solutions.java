package com.javarush.task.task01.task0134;

public class Solutions {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        return (long) a * b * c * 1000;
    }
}
