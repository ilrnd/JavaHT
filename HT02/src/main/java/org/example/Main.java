package org.example;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        for (int i = 2; i<=1000; i++){
            flag = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0) flag = false;
            }
            if (flag) System.out.print(i + ", ");
        }
    }
}