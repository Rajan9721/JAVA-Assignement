package Static;


public class BasicEx1 {
    int a = 10;

    static int age = 18;

    static{
        System.out.println("Static block");
        System.out.println("Age : "+age);
        // System.out.println(a);  // non-static variable Not allowed /Compile time error.
        // disp1(); // non-static method not allowed. 
    }
    
    static void disp(){
        System.out.println("This is static method");
        // disp1(); // We can not call non-static method and variable in the static method or in the static block 
    }

    
    void disp1(){
        System.out.println("Non static method");
        
    }
    public static void main(String[] args) {
        
        
        BasicEx1 b = new BasicEx1();
        b.disp1();
    }
    
}
