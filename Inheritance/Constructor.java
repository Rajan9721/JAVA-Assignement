package Inheritance;

class Demo1{
    int x, y;
    public Demo1(){
        System.out.println("Parent class constructor");
    }
    public Demo1(int m, int n){

        System.out.println("Parent class paramitrized constructor");
        x= m;
        y = n;
        System.out.println("Sum is: "+ (x+y));
    }

}
class Demo2 extends Demo1{
    int a, b;
    public Demo2(){

        System.out.println("Child class constructor");
    }
    public Demo2(int m, int n){
        
        System.out.println("Child class paramitrized constructor");
        a = m;
        b = n;

    }

}


public class Constructor {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
    }    
}
