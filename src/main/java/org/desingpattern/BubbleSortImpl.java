package org.desingpattern;

public class BubbleSortImpl {

    public static void main(String[] args) {

        int[] array={23,84,12,45,11,32,25,9};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
        System.out.println();
        bubbleSort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }

    }

    private static void bubbleSort(int[] array) {
        int n=array.length;
        boolean swampped;
        for(int i=0;i<n;i++){
            swampped=true;
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swampped=true;
                }
            }
        }
    }


}
