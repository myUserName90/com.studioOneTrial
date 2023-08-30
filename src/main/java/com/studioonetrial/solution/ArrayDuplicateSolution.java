package com.studioonetrial.solution;

public class ArrayDuplicateSolution {
    public static int countDuplicates(int[] arr) {
        int[] sortedArray = mergeSort(arr);
        int count = 0;
        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i] == sortedArray[i - 1]) {
                count++;
                ++i;
            }
        }
        return count;
    }


    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 3, 2, 4};
        System.out.println(countDuplicates(unsortedArray));

    }

}
