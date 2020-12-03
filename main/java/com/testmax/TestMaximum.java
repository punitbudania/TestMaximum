package com.testmax;

public class TestMaximum {
    static Integer[] numbers = {6, 7, 3};
    static Double[] floatnos = {4.6, 7.9, 9.5};
    static String[] fruits = {"Mango", "Pineapple", "Banana"};

    public static void main(String[] args) {
        System.out.println(findMax(numbers));
        System.out.println(findMax(floatnos));
        System.out.println(findMax(fruits));
    }

    public static <E extends Comparable> E findMax(E[] array) {
        E max = array[0];

        if ((max.compareTo(array[1])) < 0) {
            max = array[1];
        }
        if ((max.compareTo(array[2])) < 0) {
            max = array[2];
        }
        return max;
    }
}