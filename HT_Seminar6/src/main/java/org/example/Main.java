package org.example;

import java.util.*;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
Работу сдать как обычно ссылкой на гит репозиторий
P.S. Частые ошибки смотри в конце семинара
 */
public class Main {
    public static void main(String[] args) {
        Laptop laptop0 = new Laptop("ASUS", 4, 1024, "Windows", "black");
        Laptop laptop1 = new Laptop("ASUS", 8, 1024, "Windows", "black");
        Laptop laptop2 = new Laptop("ASUS", 8, 512, "Windows", "black");
        Laptop laptop3 = new Laptop("Acer", 4, 256, "Windows", "silver");
        Laptop laptop4 = new Laptop("Acer", 8, 512, "Windows", "black");
        Laptop laptop5 = new Laptop("HP", 4, 256, "Linux", "white");
        Laptop laptop6 = new Laptop("HP", 8, 512, "Linux", "black");
        Laptop laptop7 = new Laptop("Apple", 4, 256, "Mac OS", "silver");
        Laptop laptop8 = new Laptop("Apple", 8, 512, "Mac OS", "gold");
        Laptop laptop9 = new Laptop("Apple", 8, 512, "Mac OS", "silver");
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop0);
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        laptops.add(laptop9);

        Map<Integer, String> options = new HashMap<>();
        options.put(1, "model");
        options.put(2, "RAM");
        options.put(3, "HDD");
        options.put(4, "OS");
        options.put(5, "color");
        Map<String,Object> filter = filters(options);
        for(Laptop laptop: laptops){
            if (filter.get("HDD") == null || laptop.getHdd()>=(int)(filter.get("HDD"))){
                if (filter.get("RAM") == null || laptop.getRam()>=(int)(filter.get("RAM"))){
                    if (filter.get("model") == null || laptop.getModel().equals(filter.get("model"))){
                        if (filter.get("OS") == null || laptop.getOs().equals(filter.get("OS"))){
                            if (filter.get("color") == null || laptop.getColor().equals(filter.get("color"))){
                                System.out.println(laptop);
                            }
                        }
                    }
                }
            }
        }
    }

    static Map<String, Object> filters(Map<Integer, String> options){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметр для поиска: \n1 - Модель \n2 - Объем RAM \n3 - Объем HDD \n4 - ОС  \n5 - Цвет \n0 - для завершения");
        int menu = scanner.nextInt();
        scanner.nextLine();
        Map <String, Object> filters = new HashMap<>();
        while (menu != 0){
            switch (menu){
                case 1:{
                    System.out.print("Введите модель: ");
                    String value = scanner.next();
                    scanner.nextLine();
                    filters.put(options.get(menu),value);
                    break;
                }
                case 2:{
                    System.out.print("Введите объем RAM: ");
                    Integer value = scanner.nextInt();
                    scanner.nextLine();
                    filters.put(options.get(menu),value);
                    break;
                }
                case 3:{
                    System.out.print("Введите объем HDD: ");
                    Integer value = scanner.nextInt();
                    scanner.nextLine();
                    filters.put(options.get(menu),value);
                    break;
                }
                case 4:{
                    System.out.print("Введите ОС: ");
                    String value = scanner.next();
                    scanner.nextLine();
                    filters.put(options.get(menu),value);
                    break;
                }
                case 5:{
                    System.out.print("Введите цвет: ");
                    String value = scanner.next();
                    scanner.nextLine();
                    filters.put(options.get(menu),value);
                    break;
                }
            }
            System.out.println("Введите параметр для поиска: \n1 - Модель \n2 - Объем RAM \n3 - Объем HDD \n4 - ОС  \n5 - Цвет \n0 - для завершения");
            menu = scanner.nextInt();
            scanner.nextLine();
        }
        return filters;
    }
}