package Sarching;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element: ");
        int x = sc.nextInt();

        int result = binarySearch(arr, x);

        if(result == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index: "+result);
        }

    }
}
