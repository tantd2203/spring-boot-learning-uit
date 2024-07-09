package com.programming.javacore.interview;

public class findThirdLargest {

    public static int findThirdLargest(int arr[]) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;

            } else if (num > third) {
                third = num;
            }
        }

        return third;
    }
}
