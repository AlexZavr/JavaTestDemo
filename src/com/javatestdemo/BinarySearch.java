package com.javatestdemo;

public class BinarySearch {

    public static int find(int x, double[] arr) {
        int i = -1;
        if (arr != null) {
            int low = 0;
            int high = arr.length;
            int mid;
            while (low < high) {
                mid = (low + high) / 2;
                if (x == arr[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < arr[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
}
