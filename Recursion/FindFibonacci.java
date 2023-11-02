package Recursion;

import java.util.Scanner;

public class FindFibonacci {
    public static int findFibonacci(int n){
        int result = 0;
        if(n<=1){
            return n;
        }
        else {
            result = findFibonacci(n-1) + findFibonacci(n-2);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int result = findFibonacci(n);
        System.out.println("Fibonacci of "+ n +" number" + ":"+result);
    }
}

/*
    f(6) => f(5)+f(4) =>5+3 = 8
    f(5) => f(4)+f(3) =>3+2 = 5
    f(4) => f(3)+f(2) =>2+1 = 3
    f(3) => f(2)+f(1) =>1+1 = 2
    f(2) => f(1)+f(0) =>1+0 = 1
    f(1) => 1
    f(0) => 0
*/