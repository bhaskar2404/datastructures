package org.desingpattern.dynamicarray;

import java.util.Map;

public class DynamicArrayMain {
    public static void main(String[] args) {
        DynamicArray defaultSize=new DynamicArray();

        System.out.println("Default Capacity"+defaultSize.capacity);
        defaultSize.add("A");
        defaultSize.add("B");
        defaultSize.add("C");
        defaultSize.add("D");
    //
        System.out.println("Size"+defaultSize.size);
        System.out.println("Capacity: "+defaultSize.capacity);
        defaultSize.add("E");
        System.out.println("Size"+defaultSize.size);
        System.out.println("Capacity: "+defaultSize.capacity);
        defaultSize.add("F");
        System.out.println("Size"+defaultSize.size);
        System.out.println("Capacity: "+defaultSize.capacity);

      //  defaultSize.delete("C");
        defaultSize.add("G");
        System.out.println("new capaity Size: "+defaultSize.capacity);
        defaultSize.add("H");
        defaultSize.add("I");
        System.out.println(defaultSize);
        defaultSize.delete("C");
        defaultSize.delete("A");
        defaultSize.delete("D");
        defaultSize.delete("E");
        defaultSize.delete("G");


        System.out.println("Capacity: "+defaultSize.capacity);
        System.out.println("Data: "+defaultSize);

    }

}
