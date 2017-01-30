package task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBuiltInFunction {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello! Please enter the phrase");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String enteredString = br.readLine();

        enteredString = enteredString.replaceAll(" ", "");
        System.out.println("Phrase without gaps: " + enteredString);
    }
}