package org.example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */
public class Task3 {
    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList<>();
        fillLinkedListRandom(linkedList, 5);
        System.out.println(linkedList);
        System.out.println(sumLinkedList(linkedList));

    }
    static void fillLinkedListRandom(LinkedList<Integer> linkedList, int n){
        for (int i = 0; i < n; i++) {
            linkedList.add((int)(Math.random() * 10));
        }
    }

    static int sumLinkedList(LinkedList<Integer> list){
        int sum = 0;
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            sum += (int)iterator.next();
        }
    return sum;

    }
}
