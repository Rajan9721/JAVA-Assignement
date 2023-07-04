package MockTest;

import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive Number");
        }
        else if (a<0){
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }
    }
}
