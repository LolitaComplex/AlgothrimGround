package com.doing.algorithm;

import com.doing.algorithm.array.BinarySearch;
import com.doing.algorithm.array.MoveZero;
import com.doing.algorithm.array.RemoveElement;
import com.doing.algorithm.util.IntArrayUtil;

import java.util.Arrays;

public class Algorithm {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1. 二分查找（闭区间）
        { int index = BinarySearch.binarySearch(arr, 123); }
        // 2. 二分查找（开区间）
        { int index = BinarySearch.binarySearchOpen(arr, 123); }

        /*
         *  知识点：如何写出正确程序
         *  1. 明确变量的含义（定义变量时，注意区间定义开与闭的定义）
         *  2. 循环不变量（循环变量会修改，而定义不会被修改）
         *  3. 小数量调试
         */

        // 3. 移动零（Move Zero）
        {
            int[] data = new int[]{1, 0, 3, 0, 21, 3, 0};
            new MoveZero(IntArrayUtil.copy(data)).moveZero2();
            new MoveZero(IntArrayUtil.copy(data)).moveZero3();
            new MoveZero(IntArrayUtil.copy(data)).moveZero4();
        }

        // 4. 删除数组元素（Remove Element）
        {
            int[] data = new int[]{1, 0, 3, 0, 21, 41, 0};
            System.out.println(Arrays.toString(data));
            new RemoveElement(IntArrayUtil.copy(data)).removeElement1(0);
        }

    }
}
