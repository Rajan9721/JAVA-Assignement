package Recursion;

import java.util.Scanner;

public class SumOfAlternateSign {
//      function definition
    public static int alternateNum(int num){
        int result = 0;
//        Base case condition
        if(num == 0){
            return num;
        }
//        Recursive method calling
        else{
            if(num%2==0){
//                for even number with minus(-) sign.
                result = alternateNum(num-1)-num;
            }
            else{
//                for odd number with plus(+) sign.
                result = alternateNum(num-1)+num;
            }

        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
//        function calling
        int result = alternateNum(num);
        System.out.println("The sum of "+ num +" natural alternate sign number is: "+result);
    }
}
