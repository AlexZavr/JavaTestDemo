package com.javatestdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class BinarySearchTest {

    private static double[] arr;

    @Before
    public void setArray() {
        arr = new double[] {0, 1, 2, 3, 4, 5};
    }

    @After
    public void clearArray() {
        arr = new double[] {};
    }

    @org.junit.Test
    public void testFind() {
        assertEquals(-1, BinarySearch.find(-5, arr));
        assertEquals(3, BinarySearch.find(3, arr));
    }
}