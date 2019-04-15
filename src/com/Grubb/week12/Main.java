package com.Grubb.week12;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    /*
    Implement a Queue<E> generic type similar to the Stack<E> type but with enqueue() and dequeue() methods.
    The enqueue() method adds an element to the queue and the dequeue() method removes the first/oldest element
    from the queue. Stacks are often described as being "last-in, first-out" whereas queues represent a "first-in,
    first-out" behavior.
     */

    public static void main(String[] args) {
        Queue<Integer> newQueue = new Queue<>();
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.displayQueue();
        newQueue.dequeue();
        newQueue.displayQueue();
        newQueue.dequeue();
        newQueue.displayQueue();
    }
}

class Queue<E>{
    private ArrayList<E> elements = new ArrayList<>();


    public void enqueue(E type){
        elements.add(type);
    }
    public void dequeue(){
        elements.remove(0);
    }
    public void displayQueue(){
        System.out.println(elements);
    }
}

