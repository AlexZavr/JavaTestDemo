package com.javatestdemo;

import static org.junit.Assert.*;

public class BinarySearchTest {

    BinarySearch bs = new BinarySearch(new double[]{0,1,2,3,4,5});

    @org.junit.Test
    public void testFind() {
        assertEquals(-1, bs.find(-1));
        assertEquals(0, bs.find(0));
        assertEquals(1, bs.find(1));
        assertEquals(2, bs.find(2));
        assertEquals(3, bs.find(3));
        assertEquals(4, bs.find(4));
        assertEquals(5, bs.find(5));
    }
}