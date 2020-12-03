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
}
