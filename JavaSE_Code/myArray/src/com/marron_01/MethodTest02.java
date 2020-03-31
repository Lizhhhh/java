package com.marron_01;

public class MethodTest02 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 8, 9};
        System.out.println(getMax(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
