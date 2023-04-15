package org.example;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] numbers_out = new int[n / 2 + n % 2];
        int sum = 0;
        int j = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            if (i % 2 == 0){
                sum += numbers[i];
                numbers_out[j++] = numbers[i];
            }
        }
        System.out.println("Сумма четных элементов массива = " + sum);
        System.out.println(Arrays.toString(numbers_out));
    }
}