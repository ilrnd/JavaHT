package org.example;

import java.util.*;

/*
Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task2 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue("123");
        queue.enqueue("123123");
        queue.enqueue("asdasd");
        queue.print();
        System.out.println(queue.dequeue());
        System.out.println(queue.first());

    }
}