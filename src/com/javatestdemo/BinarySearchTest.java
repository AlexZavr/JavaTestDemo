package com.javatestdemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private static double[] arr;

    @BeforeEach
    void setUp() {
        arr = new double[] {0, 1, 2, 3, 4, 5};
    }

    @Test
    void find() {
        assertEquals(3, BinarySearch.find(3, arr));
    }

    @Test
    void notFind() {
        assertEquals(-1, BinarySearch.find(-5, arr));
    }
}