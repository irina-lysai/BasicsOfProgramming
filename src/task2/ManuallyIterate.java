package task2;

import helpers.Helper;

import java.io.IOException;
import java.util.Arrays;

public class ManuallyIterate {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        Integer[] array = Helper.createArray();

        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }

        int max = array[0];
        for (int i : array){
            if (max < i){
                max = i;
            }
        }

        System.out.println("Created Array: " + Arrays.toString(array));
        System.out.println("Min element from the array = " + min);
        System.out.println("Max element from the array = " + max);
    }
}
