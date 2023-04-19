package org.example;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jewels = scanner.next();
        String stones = scanner.next();
        int [] arr = new int[jewels.length()];
        String result = new String();
        for (char letter: jewels.toCharArray()){
            result += letter + Integer.toString(stones.split(Character.toString(letter), - 1).length-1);
        }
        System.out.println(result);
    }
}