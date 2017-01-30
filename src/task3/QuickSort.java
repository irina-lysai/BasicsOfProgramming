package task3;

import helpers.Helper;

import java.io.IOException;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        Integer[] array = Helper.createArray();
        System.out.println((array.length == 0
                ? "Array is empty: " : "Created Array: ") + Arrays.toString(array));

        int low = 0;
        int high = array.length - 1;

        quickSort(array, low, high);
        System.out.println("Sorted array = " + Arrays.toString(array));
    }

    private static void quickSort(Integer[] array, int low, int high) {
        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
