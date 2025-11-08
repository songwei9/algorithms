package com.example.algorithms;

import java.util.Arrays;

public class SortAlgorithms {

    /** 通用排序：直接调用 Java 内置排序，稳定且为 O(n log n) 复杂度 */
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        Arrays.sort(arr);
    }

    /** 自己实现快速排序（优化版：三数取中 + 尾递归转换为迭代） */
    public static void quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        while (low < high) {
            int pivotIndex = partition(arr, low, high);
            // 优化：先对较小一侧递归/循环
            if (pivotIndex - low < high - pivotIndex) {
                quickSort(arr, low, pivotIndex - 1);
                low = pivotIndex + 1;
            } else {
                quickSort(arr, pivotIndex + 1, high);
                high = pivotIndex - 1;
            }
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // 三数取中优化
        int mid = low + (high - low) / 2;
        if (arr[mid] < arr[low]) swap(arr, low, mid);
        if (arr[high] < arr[low]) swap(arr, low, high);
        if (arr[mid] < arr[high]) swap(arr, mid, high);
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
