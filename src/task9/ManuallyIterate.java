package task9;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManuallyIterate {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello! Please enter the phrase");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstString = br.readLine();
        System.out.println("Please enter one more phrase");
        String secondString = br.readLine();

        if (firstString.contains(secondString)) {
            System.out.println("Second phrase is substring of the first phrase");
        } else {
            System.out.println("Second phrase isn't substring of the first phrase");
        }
    }

}
