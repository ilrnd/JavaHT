package org.example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = fillList();
        System.out.println(list);
        System.out.println(reverseList(list));
    }
    static LinkedList <String> fillList(){
        LinkedList <String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        return list;
    }

    static LinkedList <String> reverseList(LinkedList<String> list_in){
        ListIterator<String> iterator = list_in.listIterator(list_in.size());
        LinkedList <String> list_out = new LinkedList<>();
        while (iterator.hasPrevious()){
           list_out.add(iterator.previous());
        }
        return list_out;
        }
}