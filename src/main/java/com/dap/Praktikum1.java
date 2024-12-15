package com.dap;
/*
IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author TGS a.k.a. Dwitio Ahmad Pranoto
Java Developer
Created on 15/12/2024 22:13
@Last Modified 15/12/2024 22:13
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
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
        int length = input.length();

        for (int i = 0; i < length; i++) {
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
