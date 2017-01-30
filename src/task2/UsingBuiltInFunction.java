package task2;

import helpers.Helper;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingBuiltInFunction {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        List<Integer> integerList = Arrays.asList(Helper.createArray());

        int min = Collections.min(integerList);
        int max = Collections.max(integerList);


        System.out.println("Created Array: " + integerList);
        System.out.println("Min element from the array = " + min);
        System.out.println("Max element from the array = " + max);
    }
}
