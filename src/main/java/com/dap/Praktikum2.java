package com.dap;
/*
IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author TGS a.k.a. Dwitio Ahmad Pranoto
Java Developer
Created on 19/12/2024 12:40
@Last Modified 19/12/2024 12:40
Version 1.0
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();
        System.out.println("Masukkan angka bilangan bulat: ");

        while (true) {
            try {
                String input = scanner.nextLine();
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                break;
            }
        }

        if (!numbers.isEmpty()) {
            double sum = 0;
            for (Double number : numbers) {
                sum += number;
            }
            double average = sum / numbers.size();
            System.out.printf("Rata-rata: %.2f%n", average);
        } else {
            System.out.println("Tidak ada angka yang dimasukkan");
        }

        scanner.close();
    }
}
