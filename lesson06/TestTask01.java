package ru.kravchenko.se;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TestTask01 {

    Homework homework;

    @Before
    public void init() {
        homework = new Homework();
    }

    @Test
    public void task01Test01() {
        ArrayList<Integer> inArrays = new ArrayList(Arrays.asList(1, 2 ,3 ,4, 5, 4, 1, 7));
        ArrayList<Integer> result = new ArrayList(Arrays.asList(1, 7));
        Assert.assertEquals(result, homework.task01(inArrays));
    }

    @Test
    public void task01Test02() {
        ArrayList<Integer> inArrays = new ArrayList(Arrays.asList(1, 2 ,3 ,5, 1, 1, 7, 4, 8));
        ArrayList<Integer> result = new ArrayList(Arrays.asList(8));
        Assert.assertEquals(result, homework.task01(inArrays));
    }

    @Test
    public void task01Test03() {
        ArrayList<Integer> inArrays = new ArrayList(Arrays.asList(1, 2 ,4 ,1, 1, 1, 2, 3, 8));
        ArrayList<Integer> result = new ArrayList(Arrays.asList(1, 1, 1, 2, 3, 8));
        Assert.assertEquals(result, homework.task01(inArrays));
    }

    @Test(expected = RuntimeException.class)
    public void task01Test04() {
        ArrayList<Integer> inArrays = new ArrayList(Arrays.asList(1, 2 ,0 ,1, 1, 0, 2, 3, 8));
        ArrayList<Integer> result = new ArrayList(Arrays.asList(1, 1, 1, 2, 3, 8));
        Assert.assertEquals(result, homework.task01(inArrays));
    }
}







