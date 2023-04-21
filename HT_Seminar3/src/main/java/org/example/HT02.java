package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Задан целочисленный список ArrayList.
//Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
public class HT02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = fillList(5,0, 10);
        System.out.println(list);
        System.out.println("MAX = " + maxInList(list));
        System.out.println("MIN = " + minInList(list));
        System.out.println("Average = " + averageInList(list));

    }
    static List<Integer> fillList(int capacity, int min, int max){
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++){
            result.add((int)(Math.random() * (max-min+1) + min));
        }
        return  result;
    }

    static int maxInList(List<Integer> list_in){
        int max = Collections.max(list_in);
        return max;
    }
    static int minInList(List<Integer> list_in){
        int min = Collections.min(list_in);
        return min;
    }

    static double averageInList(List<Integer> list_in){
        double sum = 0;
        for (int i = 0; i < list_in.size(); i++) {
            sum += list_in.get(i);
        }
        double average = sum / list_in.size();
        return average;
    }
}
