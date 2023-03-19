package Inheritance;

class Demo3{
    int x, y;
    public Demo3(){
        System.out.println("Parent class constructor");
    }
    public Demo3(int m, int n){

        System.out.println("Parent class paramitrized constructor");
        x= m;
        y = n;
        System.out.println("Sum is: "+ (x+y));
    }

}
class Demo4 extends Demo3{
    int a, b;
    public Demo4(){
        this(10, 20); // calling the paramitrized constructor in the same class 
        System.out.println("Child class constructor");
    }
    public Demo4(int m, int n){
        // by default its call super() method so parent class default constructor will envoked first
        System.out.println("Child class paramitrized constructor");
        a = m;
        b = n;
    }

}

public class ConstructorEx2 {
    public static void main(String[] args){ 
        Demo4 d = new Demo4();

    } 
}
    

