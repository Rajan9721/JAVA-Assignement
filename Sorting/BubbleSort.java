package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n = arr.length, temp = 0;

        for(int i = 0; i<n-1; i++){
            boolean swapped = false;
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {9, 5, 8, 7, 6, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
