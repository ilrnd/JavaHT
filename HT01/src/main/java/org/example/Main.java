package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите N: ");
        int n = scanner.nextInt();
        int sum = 1;
        int prod = 1;
        for (int i = 2; i <= n; i++){
            sum += i;
            prod *= i;
        }
        System.out.println("Сумма чисел от 1..N: " + sum);
        System.out.println("Произведение чисел от 1..N: " + prod);
    }
}