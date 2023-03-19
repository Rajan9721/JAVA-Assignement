package Inheritance;

class A{
    String name;
    int x, y;
    public A(){
        System.out.println("Parent class constructor");
    }
    public A(int m, int n){

        System.out.println("Parent class paramitrized constructor");
        x= m;
        y = n;
        System.out.println("Sum is: "+ (x+y));
    }
}
class B extends A{
    int a, b;
    public B(){
        super(10, 20); // calling the parent class paramitrized constructor 
        System.out.println("Child class constructor");
    }
    public B(int m, int n){
      
        System.out.println("Child class paramitrized constructor");
        a = m;
        b = n;
    }

}

public class ConstructorEx3 {
public static void main(String[] args) {
    B d = new B();
}    
    
}
