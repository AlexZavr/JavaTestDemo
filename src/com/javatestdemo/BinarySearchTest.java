package com.javatestdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    private static double[] arr;

    @BeforeEach
    void setUp() {
        arr = new double[] {0, 1, 2, 3, 4, 5};
    }

    @Test
    void find() {
        Assertions.assertEquals(3, BinarySearch.find(3, arr));
    }

    @Test
    void notFind() {
        Assertions.assertEquals(-1, BinarySearch.find(-5, arr));
    }
}