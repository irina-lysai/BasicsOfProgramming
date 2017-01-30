package task3;

import helpers.Helper;

import java.io.IOException;
import java.util.Arrays;

public class UsingBuiltInFunction {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        Integer[] array = Helper.createArray();

        System.out.println("Created Array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array = " + Arrays.toString(array));

    }
}
