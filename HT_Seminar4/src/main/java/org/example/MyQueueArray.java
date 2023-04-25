package org.example;

import java.util.Arrays;

public class MyQueueArray {
    private String[] arr = new String[1];
    int size = 0;
    void enqueue(String line){
        if (size == arr.length){
            String [] arr2 = new String[arr.length + 1];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = line;
    }
    void print(){
        System.out.println(Arrays.toString(arr));
    }
    String dequeue(){
        String first_el = arr[0];
        if (arr.length > 1){
            String [] arr2 = new String[arr.length - 1];
            System.arraycopy(arr, 1, arr2, 0, arr.length - 1);
            arr = arr2;
        }
        return  first_el;
    }

    String first(){
        String first_el = arr[0];
        return  first_el;
    }
}
