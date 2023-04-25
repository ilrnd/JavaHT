package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private Queue <String> queue_in = new LinkedList<String>();
    void enqueue(String line){
        queue_in.add(line);
    }
    int size(){
        return queue_in.size();
    }
    String dequeue(){
        return queue_in.poll();
    }

    String first(){
        return queue_in.peek();
    }

    void print(){
        System.out.println(queue_in);
    }
}
