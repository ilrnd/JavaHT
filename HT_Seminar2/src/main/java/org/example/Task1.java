package org.example;
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result abc
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int[] index = new int[text.length()];
        for (int i = 0; i < index.length; i++){
            index[i] = scanner.nextInt();
        }
        String result = new String();
        for (int i = 0; i < text.length(); i++){
            result += text.charAt(index[i] - 1);
       }
       System.out.println(result);
    }
}
