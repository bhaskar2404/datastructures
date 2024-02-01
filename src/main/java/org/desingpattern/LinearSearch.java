package org.desingpattern;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array={9,3,1,8,5,6,7,2};

        int index=linearSearch(array,11);
        if(index!=-1){
            System.out.println("found the element at location"+ index);
        }else{
            System.out.println("given element is not found in the array");
        }

    }

    private static int linearSearch(int[] array, int value) {
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }

}
