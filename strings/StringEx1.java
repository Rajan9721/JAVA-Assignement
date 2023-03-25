package strings;

import java.util.Scanner;

public class StringEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        sc.close();
        System.out.print("Your name is: "+name);

    }
    
}
