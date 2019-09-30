package com.javatestdemo;

public class Main {

    public static void main(String[] args) {
            BinarySearch bs = new BinarySearch(new double[] {-1, 1, 2, 3, 6});
            int res = bs.find(2);
            System.out.print(res);
    }
}
