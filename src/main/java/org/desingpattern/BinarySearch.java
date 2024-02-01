package org.desingpattern;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array=new int[10];
        int target=3;

        for(int i=0;i<10;i++){
            array[i]=i;
        }

        int index=binarySearch(array,target);

        if(index!=-1){
            System.out.println(target+" Element found at Location: "+index);
        }else
            System.out.println(target+" Element not found at Location: ");
    }

    private static int binarySearch(int[] array, int target) {
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            int value=array[middle];
            System.out.println("middle element: "+array[value]);
            if(value<target) low=middle+1;
            else if(value>target) high=middle-1;
            else return middle;
        }

        return 0;
    }
}
