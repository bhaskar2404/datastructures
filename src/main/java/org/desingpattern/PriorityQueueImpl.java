package org.desingpattern;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImpl {
    public static void main(String[] args) {
        Queue<String> priorityQueue=new PriorityQueue<>(Comparator.comparing(String::valueOf).reversed());

        priorityQueue.offer("E");
        priorityQueue.offer("N");
        priorityQueue.offer("J");
        priorityQueue.offer("L");
        priorityQueue.offer("A");
        priorityQueue.offer("C");
        priorityQueue.offer("B");

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
