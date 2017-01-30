package task10;


import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManuallyIterate {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello! Please enter the phrase");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String enteredString = br.readLine();
        String newString = "";
        int length = enteredString.length();


        for (int i =0; i < length; i ++) {
            if (enteredString.charAt(i) != ' ') {
                newString += enteredString.charAt(i);
            }
        }

        System.out.println("Phrase without gaps: " + newString);
    }
}
