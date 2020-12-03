package com.testmax;

import java.util.ArrayList;
import java.util.List;

public class TestMaximum <E extends Comparable> {

    List<E> inputlist = new ArrayList<E>();

    public TestMaximum (List<E> inputlist)
    {
        this.inputlist = inputlist;
    }

    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(12);
        numbers.add(45);
        numbers.add(34);

        findMax(numbers);
        //System.out.println(findMax(numbers));
    }


    public static <E extends Comparable> E findMax(List<E> list)
    {
        E max = list.get(0);
        for(E i : list)
        {
            if(max.compareTo(i)<0)
            {
                max = i;
            }
        }
        return max;
    }
}