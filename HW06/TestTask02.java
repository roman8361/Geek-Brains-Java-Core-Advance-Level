package ru.kravchenko.se;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTask02 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new ArrayList(Arrays.asList(1, 1, 1, 1)), false},
                {new ArrayList(Arrays.asList(1, 1, 1, 4)), true},
                {new ArrayList(Arrays.asList(1, 4, 4, 1)), true},
                {new ArrayList(Arrays.asList(4, 4, 4, 4)), false},
                {new ArrayList(Arrays.asList(1, 4, 4, 1)), true},
                {new ArrayList(Arrays.asList(1, 1, 4, 4)), true},
        });
    }
    private ArrayList a;

    private boolean c;
    public TestTask02(ArrayList a,  boolean c) {
        this.a = a;

        this.c = c;
    }
    Homework homework;

    @Before
    public void init() {
        homework = new Homework();
    }
    @Test
    public void massTestAdd() {
        Assert.assertEquals(c, homework.task02(a));
    }
}
