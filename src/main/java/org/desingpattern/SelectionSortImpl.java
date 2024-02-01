package org.desingpattern;

import java.util.stream.IntStream;

public class SelectionSortImpl {
    public static void main(String[] args) {
        int[] array={9,3,8,1,6,7,2,4,5};
        System.out.println("Before sorting");
        IntStream.range(0,array.length).forEach(i-> System.out.println(array[i]));

        selecttionSort(array);
        System.out.println("After sorting");
        IntStream.range(0,array.length).forEach(i-> System.out.println(array[i]));

    }

    private static void selecttionSort(int[] array) {
        int temp;
        int min;
        for(int i=0;i<array.length-1;i++){
            min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min=j;

                }

            }

            temp=array[i];
            array[i]=array[min];
            array[min]=temp;

        }
    }
}
