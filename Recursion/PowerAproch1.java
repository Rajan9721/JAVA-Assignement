package Recursion;

import java.util.Scanner;

public class PowerAproch1 {

    public static long powerOfElement(int a, int b){
        long result = 0;
        // Base case condition
        if(b == 1){
            return a;
        }
        // recursive relation
        else{
            result = a*powerOfElement(a, b-1);
        }
        return result;
    }
    public static void main(String[] args){

        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number a: ");
        a = sc.nextInt();
        System.out.println("Enter the number b: ");
        b = sc.nextInt();
        long result = powerOfElement(a,b);
        System.out.println("Power of a^b is : "+result);
    }
}
