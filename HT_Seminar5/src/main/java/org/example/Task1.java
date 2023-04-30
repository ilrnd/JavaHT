package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    /*
    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге
     */
    public static void main(String[] args) {
        command();
    }

    static void command(){
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите команду (a - добавление, s - поиск, g - показать книгу, q - выход): ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("q")) break;
            switch (command){
                case "a": {
                        List<String> phoneNumbers = new LinkedList<>();
                        System.out.print("Введите имя: ");
                        String name = scanner.nextLine();
                        System.out.print("Введите номер телефона: ");
                        String number = scanner.nextLine();
                        phoneNumbers.add(number);
                        System.out.print("Хотите добавить еще один номер Y - да, N - нет: ");
                        String command2 = scanner.nextLine();
                        if (command2.equalsIgnoreCase("y")){
                            System.out.print("Введите номер телефона: ");
                            number = scanner.nextLine();
                            phoneNumbers.add(number);
                        }
                        phoneBook.addNewPeople(name, phoneNumbers);
                        break;
                }
                case "g": {
                        phoneBook.getPhoneBook();
                        break;
                    }
                case "s": {
                        System.out.print("Введите имя для поиска: ");
                        String name = scanner.nextLine();
                        System.out.println(phoneBook.findNumbers(name));
                }
            }
        }
    }
}
