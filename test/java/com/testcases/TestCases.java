package com.testcases;

import com.testmax.TestMaximum;
import org.junit.Assert;
import org.junit.Test;

public class TestCases
{
    Integer[] FirstTest = {6, 5, 2};
    @Test
    public void MaxatFirstPosition()
    {
        TestMaximum FirstMax = new TestMaximum();
        Integer result = FirstMax.findMax(FirstTest);
        Assert.assertEquals(FirstTest[0], result);
    }

    Integer[] SecondTest = {2, 6, 3};
    @Test
    public void MaxatSecondPosition()
    {
        TestMaximum SecondMax = new TestMaximum();
        Integer result = SecondMax.findMax(SecondTest);
        Assert.assertEquals(SecondTest[1], result);
    }

    Integer[] ThirdTest = {1, 0, 6};
    @Test
    public void MaxatThirdPosition()
    {
        TestMaximum ThirdMax = new TestMaximum();
        Integer result = ThirdMax.findMax(ThirdTest);
        Assert.assertEquals(ThirdTest[2], result);
    }

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
}
