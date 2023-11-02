package ArraysEx;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the rows: ");
        int row = sc.nextInt();

        System.out.print("Entre the size of the column: ");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        System.out.println("Enter the Values");

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            } 
            System.out.println();
        }   

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            } 
            System.out.println();
        }       
    }
    
}
