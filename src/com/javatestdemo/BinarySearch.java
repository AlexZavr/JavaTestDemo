package com.javatestdemo;

public class BinarySearch {

    private double[] arr;

    public BinarySearch(double[] arr) {
        this.arr = arr;
    }

    public int find(double x) {
        int i = -1;
        if (this.arr != null) {
            int low = 0;
            int high = this.arr.length;
            int mid;
            while (low < high) {
                mid = (low + high) / 2;
                if (x == this.arr[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < this.arr[mid]) {
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
