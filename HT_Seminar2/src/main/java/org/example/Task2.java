package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
//Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество рецептов: ");
        int n = scanner.nextInt();
        System.out.print("Введите количество аллергенов: ");
        int m = scanner.nextInt();
        String [] book = new String[n];
        scanner.nextLine();
        for (int i = 0; i < book.length; i++){
            System.out.print("Рецепт " + (i + 1) +". ");
            book[i] =  scanner.nextLine();
        }
        String [][] allergy = new String[m][];
        System.out.println("Введите алергены через знак - : ");
        for (int i = 0; i < m; i++) {
            allergy[i] = scanner.nextLine().split(" - ");
        }

        String [][] allergy_up = new String[allergy.length][allergy[0].length];
        for (int i = 0; i < allergy_up.length; i++){
            for (int j = 0; j < allergy_up[i].length; j++){
                allergy_up[i][j] = allergy[i][j].substring(0,1).toUpperCase() + allergy[i][j].substring(1);
            }
        }

        String [] book_out = new String[n];
        for (int i = 0; i < book.length; i++) {
            for (int j = 0; j < allergy.length; j++) {
                book[i] = book[i].replace(allergy[j][0], allergy[j][1]);
                book[i] = book[i].replace(allergy_up[j][0], allergy_up[j][1]);
            }
        }

        for (int i = 0; i < book_out.length; i++){
            System.out.println("Рецепт " + (i + 1) + ". " + book[i]);
        }
    }
}

