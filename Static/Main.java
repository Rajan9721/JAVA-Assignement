package Static;

class StaticEx {
    int x = 10;
    static int a = disp();
    static int b;

    static {
        // static int b = 20; //not allowed
        System.out.println("Static block"+a);
        System.out.println(b);
        
    }


    static int disp(){
        System.out.println("Static method");
        return 20;
    }
    // a = a+10;    // Not Allowed
    // int b = a+20;

    // static{
    //     System.out.println(a);
    //     a = a+10;  // Allowed 
    //     System.out.println(a);
    // }

    void disp1(){
        a = 10;
        System.out.println(a);
    }

}
   
public class Main{
    public static void main(String[] args) {

        StaticEx s = new StaticEx(); 
        s.disp1();
        s.x = 20;
        


    }

}
