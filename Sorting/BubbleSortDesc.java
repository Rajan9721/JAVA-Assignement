package Sorting;

import java.util.Arrays;

public class BubbleSortDesc {
    public static void bubbleSortDes(int[] arr){
        int temp = 0;
        boolean swapped = false;
        for (int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {3,5,1,6,0};
        bubbleSortDes(arr);
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
}
