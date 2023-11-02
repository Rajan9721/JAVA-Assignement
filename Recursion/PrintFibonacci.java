package Recursion;

import java.util.Scanner;

public class PrintFibonacci {
    public static void printFib(String str, int n){
        if(n<=1){
            System.out.println(n);
        }
        else{
            printFib(str+"", n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for fibonacci: ");
        int n = sc.nextInt();
//        int n1 = 0;
//        int n2 = 1;
//        int n3 = 0;
//        sc.close();
//        System.out.print("Fibonacci number up to "+n+" is: ");
//        System.out.print(n1+" "+n2);
//        for(int i = 2; i<=n; i++){
//           n3 = n1 + n2;
//           n1 = n2;
//           n2 = n3;
//           System.out.print(" "+n3);
//        }

    }
}
