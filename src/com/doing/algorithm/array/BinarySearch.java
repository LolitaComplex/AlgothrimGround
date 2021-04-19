package com.doing.algorithm.array;

import com.doing.algorithm.util.SortUtil;

public class BinarySearch {

    // 对有序数组进行二分查找（闭区间）
    public static <T extends Comparable<T>> int binarySearch(Comparable<T>[] arr, Comparable<T> target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // 在 [left, right] 这个区间内查找元素
        int left = 0;
        int right = arr.length - 1;

        // 考虑这块儿边界（是否有=），可以参考当目标数组只有1个元素，也就是 left == right 时，这时仍然要查找来判断
        // 可以种初始数据，不要去想中间循环过程的数据
        while (left <= right) {
            int mid = (left + right) / 2;
            int result = SortUtil.less(arr[mid], target);
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    // 对有序数组进行二分查找（开区间）
    public static <T extends Comparable<T>> int binarySearchOpen(Comparable<T>[] arr, Comparable<T> target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // 在 [left, right) 这个区间内查找元素
        int left = 0;
        int right = arr.length;

        // 其实如果改成开区间，把定义那边的数字通通 +1 即可，或者 删除 =
        // 这里考虑结尾处，[end, end) 是一个无效区间，符合定义
        while (left < right) {
            int mid = (left + right) / 2;
            int result = SortUtil.less(arr[mid], target);
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return -1;
    }
}
