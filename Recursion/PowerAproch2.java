package Recursion;

import java.util.Scanner;

public class PowerAproch2 {
    public static int powerOfElement(int a, int b){
        int result = 0, finalResult = 0, mid = b/2;;
        // Base case condition
        if(b == 1){
            return a;
        }
        else{
            result = powerOfElement(a, mid);
            finalResult = result * result;

            if(b%2 == 0){
               return finalResult;
            }
            else {
                return a*finalResult;
            }
        }

    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number a: ");
        a = sc.nextInt();
        System.out.println("Enter the number b: ");
        b = sc.nextInt();
        int result = powerOfElement(a,b);
        System.out.println("Power of a^b is : "+result);
    }
}
