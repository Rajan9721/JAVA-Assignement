import java.util.Scanner;

public class TryWithResourse{
    public static void main(String[] args){

        int num1 = 0;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            num1 = sc.nextInt();
        }

        // catch(Exception e){
        //     System.out.println("Envalid input "+ e);
        // }
        System.out.println(num1);
    }
}