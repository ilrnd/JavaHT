package org.example;

import java.util.ArrayList;
import java.util.List;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class HT01 {
    public static void main(String[] args) {
        List<Integer> list = fillList(10, 0, 10);
        System.out.println(list);
        list = deleteEvenNumbers(list);
        System.out.println(list);
    }

    static List<Integer> deleteEvenNumbers(List<Integer> result){
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) % 2 == 0) {
                result.remove(i);
                i--;
            }
        }
        return result;
    }
    static List<Integer> fillList(int capacity, int min, int max){
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++){
            result.add((int)(Math.random() * (max-min+1) + min));
        }
        return  result;

    }
}