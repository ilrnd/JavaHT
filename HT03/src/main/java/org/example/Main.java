package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите команду (q - для выхода), (s - для ввода команды): ");
            String command = scanner.next();
            switch (command) {
                case ("q"):
                    break;
                case ("s"):
                    System.out.print("Введите первое число: ");
                    double a = scanner.nextDouble();
                    System.out.print("Введите оператор (+, -, *, /): ");
                    String operator = scanner.next();
                    System.out.print("Введите второе число: ");
                    double b = scanner.nextDouble();
                switch (operator) {
                    case ("+"):
                        System.out.println(a + " + " + b + " = " + (a + b));
                        break;
                    case ("-"):
                        System.out.println(a + " - " + b + " = " + (a - b));
                        break;
                    case ("/"):
                        System.out.println(a + " / " + b + " = " + (a / b));
                        break;
                    case ("*"):
                        System.out.println(a + " * " + b + " = " + (a * b));
                        break;
                    default: System.out.println("Введен неверный оператор");
                }
            }
           if (command.charAt(0) == 'q') break;
        }
    }
}
