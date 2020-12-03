package com.testmax;

public class TestMaximum <E extends Comparable> {
    //static Integer[] numbers = {6, 7, 3};
    //static Double[] floatnos = {4.6, 7.9, 9.5};
    //static String[] fruits = {"Mango", "Pineapple", "Banana"};

    E x;
    E y;
    E z;

    public TestMaximum (E x, E y, E z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args)
    {
        Integer xInt = 0;
        Integer yInt = 4;
        Integer zInt = 9;
        System.out.println(findMax(xInt, yInt, zInt));
        //System.out.println(findMax(floatnos));
        //System.out.println(findMax(fruits));
    }

    public static <E extends Comparable> E findMax(E x, E y, E z) {
        E max = x;

        if ((max.compareTo(y)) < 0) {
            max = y;
        }
        if ((max.compareTo(z)) < 0) {
            max = z;
        }
        return max;
    }
}