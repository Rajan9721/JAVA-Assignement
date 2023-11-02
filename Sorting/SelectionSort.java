package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int min, temp = 0;
        for(int i = 0; i<arr.length; i++){
            min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min!=i){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        selectionSort(arr);
        System.out.println("Selection sort is: "+ Arrays.toString(arr));
    }
}
