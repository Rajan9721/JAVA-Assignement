package Static;
import java.util.Scanner;

class Loan{
    int pa;        // Principal ammount
    float time; // time duration
    static float rate; // rate of interest
    float si; // simple interest
    float total ;
    static{
        rate = 8.5f;  // memory alocation only one time among all the objects besause of static
    }

void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please mention the ammount required: ");
    pa = sc.nextInt();
    System.out.println("Please Mention time duration: ");
    time = sc.nextFloat();
    }

void compute(){
    si = (pa*rate*time)/100;
}

void ammountPayable(){
    total = si + pa;
}

void disp(){
    System.out.println("Simple interest "+si);
    System.out.println("Total payable ammount :"+total);
}

}

public class Ex2 {
    public static void main(String[] args) {
        Loan l = new Loan();
        l.input();
        l.compute();
        l.ammountPayable();
        l.disp();
        
    }    
}
