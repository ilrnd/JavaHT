package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
public class HT03 {
    public static void main(String[] args) {
        String [] planets_all = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        List<String> list = planetsFill(10, planets_all);
        System.out.println(list);
        planetsCount(list, planets_all);
    }
    static List<String> planetsFill(int capacity, String[] planets_all){
        List<String> planets = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            planets.add(i, planets_all[(int)(Math.random() * planets_all.length)]);
        }
        return planets;
    }

    static void planetsCount(List<String> list_in, String [] planets_all){
        for (int i = 0; i < planets_all.length; i++) {
            int count = Collections.frequency(list_in, planets_all[i]);
            if (count > 0) System.out.println(planets_all[i] + " - " + count +" раз(а)");
        }
    }
}
