package Operators;


public class IncreDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = a++; // post Increment
        int d = ++a; // pre increment
        int e = b--; // post decrement
        int f = --b; // pre decrement
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    
}
