//time complexity = O(n)
// Space Complexity =
package Sarching;

import java.util.Scanner;

public class LinearSearch {

    public static void linearSearch(int arr[], int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element is found at index: "+i);
                break;
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        linearSearch(arr, target);
    }
}
