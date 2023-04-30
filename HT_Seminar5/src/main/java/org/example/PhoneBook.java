package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map <String, List<String>> phoneBook = new HashMap<>();

    void addNewPeople(String name, List<String> phoneNumber){
        phoneBook.put(name, phoneNumber);
    }

    String findNumbers(String name){
        return name + " " + phoneBook.get(name).toString();
    }

    void getPhoneBook()
    {
        System.out.println(phoneBook);
    }
}
