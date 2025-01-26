package sorting;

import java.util.Arrays;

public class SortExample {


    public static int[] doBubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }

    public static int[] doSelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] doInsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];

            for (int j = i - 1; j >= 0 && key < arr[j]; j--) {
                arr[j + 1] = arr[j];
                arr[j] = key;
            }

        }
        return arr;
    }

    public static int[] doMergeSort(int[] arr) {
        return arr;
    }

    public static int[] doQuickSort(int[] arr) {
        return arr;
    }
}



