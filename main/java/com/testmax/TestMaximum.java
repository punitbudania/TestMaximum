package com.testmax;

public class TestMaximum
{
    static Integer[] numbers = {6, 7, 3};

    public static void main(String[] args)
    {
        System.out.println(findMax(numbers));
    }

    public static Integer findMax(Integer[] array)
    {
        Integer max= array[0];

        if ((max.compareTo(array[1])) < 0)
        {
            max = array[1];
        }
        if((max.compareTo(array[2])) < 0)
        {
            max = array[2];
        }
        return max;
    }

}
