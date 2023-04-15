package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("2? + ?5 = 69");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите q: ");
        int q = scanner.nextInt();
        System.out.print("Введите w: ");
        int w = scanner.nextInt();
        System.out.print("Введите e: ");
        int e = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if ((q * 10 + i) + (j * 10 + w) == e){
                    System.out.print((q * 10 + i) +"+"+ (j * 10 +w) + "=" + e);
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false) System.out.print("Решений нет");
    }
}