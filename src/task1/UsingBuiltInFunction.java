package task1;

import helpers.Helper;

import java.io.IOException;
import java.util.Arrays;

public class UsingBuiltInFunction {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");

        Integer[] array = Helper.createArray();
        Integer sum = Arrays.asList(array).stream().mapToInt(Integer::intValue).sum();

        System.out.println("Created Array: " + Arrays.toString(array));
        System.out.println("Sum of array elements = " + sum);
    }
}