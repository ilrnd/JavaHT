package org.example;

import java.util.*;

public class Task2 {
    /*
    Пусть дан список сотрудников:
    Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
    Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
    Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
     */
    public static void main(String[] args) {
        String text = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String [] rows = text.split(", ");
        Map<Integer, String> namePeople = new TreeMap<>(Comparator.reverseOrder());
        countName(rows, namePeople);
    }
    public static void countName(String[] people, Map<Integer, String> namePeople){
        List <String> list = new ArrayList<>();
        for (String person: people){
            String name = person.split(" ")[0];
            list.add(name);
        }
        for (String name : list){
            namePeople.put(Collections.frequency(list, name), name);
        }
        System.out.println(namePeople);
    }
}
