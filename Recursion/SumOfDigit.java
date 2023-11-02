package Recursion;

import java.util.Scanner;

public class SumOfDigit{
    public static int sumOfDigit(int num){
        int result = -1;
        if(num == 0){
            return 0;
        }
        else{
            result =num%10 + sumOfDigit(num/10);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, result;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        result = sumOfDigit(num);
        System.out.println(result);
    }
}
