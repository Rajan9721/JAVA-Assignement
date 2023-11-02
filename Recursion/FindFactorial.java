package Recursion;

import java.util.Scanner;

public class FindFactorial
{
    public static int findFactorial(int n){
        int result = 0;
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            result = n * findFactorial(n-1);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int n = sc.nextInt();
        int result = findFactorial(n);
        System.out.println("Factorial of given number is: "+result);
    }
}
