package org.desingpattern;

import java.util.LinkedList;

public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");
        linkedList.add(5,"I");
        linkedList.offerFirst("Began");
        linkedList.offerLast("End");
        System.out.println(linkedList);
       // System.out.println(linkedList.poll());
        System.out.println(linkedList.remove("C"));
        System.out.println(linkedList);

    }
}
