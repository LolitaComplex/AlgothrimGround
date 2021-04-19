package com.doing.algorithm.util;

import java.util.Arrays;

public class IntArrayUtil {

    public static int[] copy(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
