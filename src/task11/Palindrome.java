package task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello! Please enter the phrase or word");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String original = br.readLine();
        String reverse = "";
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
           reverse += original.charAt(i);
        }

        if (original.equals(reverse))
            System.out.println("Entered phrase or word is a palindrome.");
        else
            System.out.println("Entered phrase or word isn't a palindrome.");
    }


}
