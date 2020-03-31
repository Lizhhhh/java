package com.marron_03;

public class StringTest04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr2String(arr));
    }

    public static String arr2String(int[] arr) {
        String str = "";
        str += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str += arr[i] + ", ";
            } else {
                str += arr[i];
            }
        }
        str += "]";
        return str;
    }
}
