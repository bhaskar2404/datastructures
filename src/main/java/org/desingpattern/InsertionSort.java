package org.desingpattern;

import java.util.stream.IntStream;

public class InsertionSort {

    public static void insertionSort(int[] array){
        for(int i=1; i<array.length;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        System.out.println();
        IntStream.range(0,array.length).forEach(i->System.out.println(array[i]));

    }
    public static void main(String[] args) {

        int[] arrray={6,3,2,1,5};
        IntStream.range(0,arrray.length).forEach(i->System.out.println(arrray[i]));
        insertionSort(arrray);

    }
}
