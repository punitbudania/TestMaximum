package com.testcases;

import com.testmax.TestMaximum;
import org.junit.Assert;
import org.junit.Test;

public class TestCases <T extends Comparable>
{
    Integer a = 6;
    Integer b = 5;
    Integer c = 2;
    private T x;
    private T y;
    private T z;

    @Test
    public void MaxatFirstPosition()
    {
        TestMaximum FirstMax = new TestMaximum(x, y, z);
        Integer result = FirstMax.findMax(a, b, c);
        Assert.assertEquals(a, result);
    }

    @Test
    public void MaxatSecondPosition()
    {
        TestMaximum SecondMax = new TestMaximum(x, y, z);
        Integer result = SecondMax.findMax(b, a, c);
        Assert.assertEquals(a, result);
    }

    @Test
    public void MaxatThirdPosition()
    {
        TestMaximum ThirdMax = new TestMaximum(x, y, z);
        Integer result = ThirdMax.findMax(c, b, a);
        Assert.assertEquals(a, result);
    }

    /*
    Double[] DFirstTest = {8.1, 7.4, 3.4};
    @Test
    public void DMaxatFirstPosition()
    {
        TestMaximum DFirstMax = new TestMaximum();
        Double result = DFirstMax.findMax(DFirstTest);
        Assert.assertEquals(DFirstTest[0], result);
    }

    Double[] DSecondTest = {3.5, 6.7, 2.3};
    @Test
    public void DMaxatSecondPosition()
    {
        TestMaximum DSecondMax = new TestMaximum();
        Double result = DSecondMax.findMax(DSecondTest);
        Assert.assertEquals(DSecondTest[1], result);
    }

    Double[] DThirdTest = {3.6, 2.5, 5.3};
    @Test
    public void DMaxatThirdPosition()
    {
        TestMaximum DThirdMax = new TestMaximum();
        Double result = DThirdMax.findMax(DThirdTest);
        Assert.assertEquals(DThirdTest[2], result);
    }

     */
}
