package Sorting;

import java.util.Arrays;

public class SelectionSortDes {

    public static void selectionSort(int[] arr){
        int temp = 0;
        for(int i = 0; i<arr.length; i++){
            int max = i;
            for(int j = i+1; j<arr.length-1; j++){
                if(arr[max]<arr[j]){
                    max = j;
                }
            }
            if(max!=i){
                temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }

    }
    public static void main(String[] args){
        int arr[] = {3,5,1,6,0};
        selectionSort(arr);
        System.out.println(("Sorted array are: "+ Arrays.toString(arr)));
    }
}
