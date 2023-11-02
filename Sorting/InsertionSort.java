package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {100, 10, 15, 20, 5, 50,  12, 16, 0};
        insertionSort(arr);
        System.out.println("Sorted array is: "+ Arrays.toString(arr));
    }
}
