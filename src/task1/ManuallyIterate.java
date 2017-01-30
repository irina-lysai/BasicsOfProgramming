package task1;

import helpers.Helper;
import java.io.IOException;
import java.util.Arrays;

public class ManuallyIterate {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello!");

        Integer[] array = Helper.createArray();
        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        System.out.println("Created Array: " + Arrays.toString(array));
        System.out.println("Sum of array elements = " + sum);
    }


}
