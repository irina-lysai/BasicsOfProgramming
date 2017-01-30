package task4;

import helpers.Helper;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UsingBuiltInFunction {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");
        List<Integer> list1 = Arrays.asList(Helper.createArray());
        List<Integer> list2 = Arrays.asList(Helper.createArray());

        System.out.println("Created Array 1: " + list1);
        System.out.println("Created Array 2: " + list2);
        list1.retainAll(list2);
        System.out.println("Common elements: " + new HashSet<>(list1));
    }
}
