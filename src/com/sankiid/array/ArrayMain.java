package com.sankiid.array;


import com.sankiid.sort.SearchUtils;
import com.sankiid.sort.SortUtils;

/**
 * Created by sandeep on 12/2/17.
 */
public class ArrayMain {

    public static void main(String[] a) {
        findSum();
    }

    private static void findSum() {
        Integer[] arr = {2, 4, 3, 8, 6, 7, 9, 1};
        SortUtils.insertionSort(arr);
        int x = 11;
        boolean sumExist = false;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > x) {
                break;
            }
            int r = x - arr[i];
            sumExist = SearchUtils.binarySearch(arr, r) >= 0 ? true: false;
            if(sumExist) break;
        }
        System.out.print(sumExist);
    }
}
