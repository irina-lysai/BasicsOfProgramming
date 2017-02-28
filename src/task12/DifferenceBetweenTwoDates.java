package task12;


import helpers.Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Date;

import static java.lang.Math.abs;

public class DifferenceBetweenTwoDates {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello! Please enter the first date in the format dd.MM.yyyy");
        Date date1 = Helper.validateDate(br);
        System.out.println("Please enter the second date in the format dd.MM.yyyy");
        Date date2 = Helper.validateDate(br);

        long diff = abs((date1.getTime() - date2.getTime()) / (24 * 60 * 60 * 1000));
        System.out.println(diff);

    }
}

