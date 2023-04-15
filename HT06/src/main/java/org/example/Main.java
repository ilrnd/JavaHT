package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++){
            boolean flag = true;
            for (int j = 0; j < numbers.length; j++){
                if (numbers[i] == numbers[j] && i != j) flag = false;
            }
            if (flag) System.out.println(numbers[i]);
        }
    }
}