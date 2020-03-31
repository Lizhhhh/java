package com.marron_03;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.printf(arr2String(arr));

    }

    public static String arr2String(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i]);
                sb.append(", ");
            } else {
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        String str = sb.toString();
        return str;
    }
}
