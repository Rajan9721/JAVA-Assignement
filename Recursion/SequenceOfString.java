package Recursion;

import java.util.ArrayList;

public class SequenceOfString {

// Q)  Print all the sequence of string using recursion.
    public static void sequenceOfArray(int arr[], int index, ArrayList<Integer> arrayList){
        if(index == arr.length){
            if(arrayList.size()>0){
                System.out.println(arrayList);
            }
            return;
        }

//        recursion call
//        include the value
        sequenceOfArray(arr, index+1, arrayList);
        arrayList.add(arr[index]);

//        Not include the value
        sequenceOfArray(arr, index+1, arrayList);
        arrayList.remove(arrayList.size()-1);
    }
    public static void main(String[] args){
        int arr[] = {1, 4};
        sequenceOfArray(arr, 0, new ArrayList<>());

    }
}
