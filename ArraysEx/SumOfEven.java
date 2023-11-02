package ArraysEx;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        int result = 0, n;
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(i%2 == 0){
               result += arr[i];
            }
        }
        System.out.println("Sum of even indices: "+result);
    }
}
