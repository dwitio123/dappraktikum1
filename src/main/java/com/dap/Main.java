package com.dap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kata : ");
        String input = scanner.nextLine();

        int output = calculateChar(input);
        System.out.println("Hasil: " + output);

        scanner.close();
    }

    public static int calculateChar(String input) {
        int letter = 0;
        int number = 0;
        int space = 0;
        int symbol = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                letter++;
            } else if (Character.isDigit(c)) {
                number++;
            } else if (Character.isWhitespace(c)) {
                space++;
            } else {
                symbol++;
            }
        }

        return ((letter * 21) + (number * 56) + (space * 10) + (symbol * 18));
    }
}