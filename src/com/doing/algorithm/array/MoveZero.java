package com.doing.algorithm.array;

import com.doing.algorithm.util.IntArrayUtil;

import java.util.Arrays;

public class MoveZero {

    /*
     * 给定一个数组 nums，写一个函数，将数组中所有的0挪到数组的末尾，而维持其他所有非0元素的相对位置
     *
     * 举例： nums = [0, 1, 0, 3, 12], 函数运行后结果为 [1, 3, 12, 0, 0]
     */

    private final int[] arr;

    public MoveZero(int[] arr) {
        this.arr = arr;
    }

    // 方案1: 暴力遍历，不是零的元素与后边每个元素交换位置

    /**
     *  方案2：遍历一遍数组，把不是零的添加新数组中即可（这里用了Java数组元素默认值为0的特性）
     *  时间复杂度0(n)
     *  空间复杂度O(n)
     */
    public void moveZero2() {
        int[] copyArr = new int[arr.length];

        int index = 0;
        for (int i : arr) {
            if (i != 0) {
                copyArr[index++] = i;
            }
        }
        System.out.println(Arrays.toString(copyArr));
    }

    /**
     * 方案3：遍历一遍数组，途中使用两个指针i, k（具体看代码吧）
     * 空间复杂度O(n + k)
     */
    public void moveZero3() {
        int k = 0;
        // 遍历数组，把不是0的元素添加到数组移动到数组前边，并递增k指针
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }

        // 把k到数组结尾元素全部替换为0
        for (; k <= arr.length - 1; k++) {
            arr[k] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 方案3：遍历一遍数组，途中使用两个指针i, k，交换的方式（具体看代码吧）
     * 空间复杂度O(n)
     */
    public void moveZero4() {
        /*
         * 遍历到第i个元素，保证[0, i]中所有非0元素
         * 都按照顺序排列在[0, k)中
         * 同时[k, i]为 0
         */
        for (int i = 0, k = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 0) {
                if (arr[k] != arr[i]) { // 如果数组中有很多相等的元素，这块将起到优化
                    IntArrayUtil.swap(arr, k, i);
                }
                k++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
