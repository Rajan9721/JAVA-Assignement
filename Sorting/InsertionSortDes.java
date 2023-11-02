package Sorting;

import java.util.Arrays;

public class InsertionSortDes {
    public static void insertionSort(int arr[]){
        int temp = 0;
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]<key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        insertionSort(arr);
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
}
