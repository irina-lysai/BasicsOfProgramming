package task4;

import helpers.Helper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManuallyIterate {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        Integer[] array1 = Helper.createArray();
        Integer[] array2 = Helper.createArray();

        System.out.println("Created Array 1: " + Arrays.toString(array1));
        System.out.println("Created Array 2: " + Arrays.toString(array2));
        System.out.println("Common elements: " + getCommonElement(array1, array2));
    }

    public static List<Integer> getCommonElement(Integer[] arr1, Integer[] arr2) {
        List<Integer> commonElements = new ArrayList<Integer>();
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j && !commonElements.contains(i)) {
                    commonElements.add(i);
                }
            }
        }

        return commonElements;
    }
}