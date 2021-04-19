package com.doing.algorithm.util;

public class SortUtil {

    public static <T extends Comparable<T>> int less(Comparable<T> small, Comparable<T> large) {
        return small.compareTo((T) large);
    }
}
