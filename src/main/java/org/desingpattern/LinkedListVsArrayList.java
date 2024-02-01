package org.desingpattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {
    public static void main(String[] args) {
        long startTime;
        long endtime;
        long elapsedtime;
        LinkedList<Integer> linkedList=new LinkedList<>();
        ArrayList<Integer> arrayList=new ArrayList<>();

        for(int i=0;i<1000000;i++){
            linkedList.offer(i);
            arrayList.add(i);

        }

        startTime=System.nanoTime();
//        linkedList.get(99999);
        linkedList.remove(50000);
        endtime=System.nanoTime();
        elapsedtime=endtime-startTime;
        System.out.println("Linked List: "+endtime);

        startTime=System.nanoTime();
//        arrayList.get(99999);
        arrayList.remove(50000);
        endtime=System.nanoTime();
        elapsedtime=endtime-startTime;
        System.out.println("ArrayList List: "+endtime);

    }
}
