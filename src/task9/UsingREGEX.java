package task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingREGEX {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello! Please enter the phrase");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstString = br.readLine();
        System.out.println("Please enter one more phrase");
        String secondString = br.readLine();

        Pattern p = Pattern.compile(secondString,Pattern.LITERAL);
        Matcher m = p.matcher(firstString);
        if (m.find()){
            System.out.println("Second phrase is substring of the first phrase");
        } else {
            System.out.println("Second phrase isn't substring of the first phrase");
        }

    }
}
