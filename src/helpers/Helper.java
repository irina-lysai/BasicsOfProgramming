package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Helper {

    public static Integer[] createArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = getSizeOfArray(br);
        int bound = getBoundOfElements(br);

        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound);
        }

        return array;
    }

    private static int getBoundOfElements(BufferedReader br) throws IOException {
        try {
            System.out.println("Please enter bound of elements");
            int bound = Integer.parseInt(br.readLine());
            while (bound < 0) {
                System.err.println("Bound cannot be negative.");
                bound = Integer.parseInt(br.readLine());
            }

            return bound;
        } catch (NumberFormatException nfe) {
            System.err.println("Wrong number! Please enter integer number.");
            return getBoundOfElements(br);
        }
    }

    private static int getSizeOfArray(BufferedReader br) throws IOException {
        try {
            System.out.println("Please enter size of array");
            int size = Integer.parseInt(br.readLine());
            while (size < 0) {
                System.err.println("Array size cannot be negative. Please enter positive number");
                size = Integer.parseInt(br.readLine());
            }

            return size;
        } catch (NumberFormatException nfe) {
            System.err.println("Wrong number! Please enter integer number.");
            return getSizeOfArray(br);
        }
    }


    public static Integer getYear(BufferedReader br) throws IOException {
        try {
            Integer year = Integer.parseInt(br.readLine());
        return year;
        } catch (NumberFormatException nfe) {
            System.err.println("It's not a year! Please enter correct year.");
        return getYear(br);}
    }


    public static Date validateDate(BufferedReader br) {
        String pattern = "dd.MM.yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
           Date date = dateFormat.parse(br.readLine());
            dateFormat.format(new Date());
            System.out.println(date);
            return date;

        }
         catch (IOException | ParseException e) {
            System.out.println("Please enter a date in the format dd.MM.yyyy");
            return validateDate(br);
        }
    }
}
