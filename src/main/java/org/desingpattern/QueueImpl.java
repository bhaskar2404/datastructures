package org.desingpattern;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Queue<String> nameQueue=new LinkedList<>();
        nameQueue.offer("One");
        nameQueue.offer("Two");
        nameQueue.offer("Three");
        nameQueue.offer("Four");
        System.out.println(nameQueue);
        System.out.println(nameQueue.poll());
        System.out.println(nameQueue.isEmpty());
//        System.out.println(nameQueue.);
    }
}
