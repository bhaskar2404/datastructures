package org.desingpattern;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer>  intStack=new Stack<>();
        System.out.println(intStack.empty());
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);
        intStack.stream().forEach(System.out::println);
        System.out.println(intStack.capacity());
       // System.out.println(intStack.ensureCapacity());

    }
}
