package com.doing.algorithm.array;

import com.doing.algorithm.util.IntArrayUtil;

import java.util.Arrays;

public class RemoveElement {

    /*
     * 给定一个数组 nums 和一个数值 val，写一个函数，将数组中所有等于val的元素删除，并返回剩余个数
     *
     * 举例： nums = [0, 1, 0, 3, 12], val = 0，返回的结果是 3，数组为 nums = [1, 3, 12]
     *
     * 1. 如何定义删除，从数组中删除，还是放到数组末尾
     * 2. 剩余元素的排列是否要保证原有的相对顺序
     * 3. 是否有空间复杂度的要求
     */

    private final int[] arr;

    public RemoveElement(int[] arr) {
        this.arr = arr;
    }

    // 方案1：空间复杂度O(n)，时间复杂度O(n)
    public void removeElement1(int value) {
        int[] copy = new int[arr.length];

        // 在新数组 [0, k) 这个区间内保持是不等于value的全部元素
        int k = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != value) {
                copy[k++] = arr[i];
            }
        }

        System.out.println("length: " + k + "\t Array: "
                + Arrays.toString(copy));
    }
}
