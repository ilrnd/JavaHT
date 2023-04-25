package org.example;
/*
Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди, dequeue()
- возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
реализовать вторую задачу через собственный класс используя в основе массив
 */
public class Task4 {
    public static void main(String[] args) {
        MyQueueArray queue = new MyQueueArray();
        queue.enqueue("123");
        queue.enqueue("hi");
        queue.enqueue("hello");
        queue.print();
        System.out.println(queue.dequeue());
        queue.print();
        System.out.println(queue.first());
        queue.print();
    }
}
