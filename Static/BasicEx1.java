package Static;


public class BasicEx1 {
    int a = 10;

    static int age = 18;
    
    static void disp(){
        System.out.println("This is static method");
    }

    
    void disp1(){
        System.out.println("Non static method");
    }
    public static void main(String[] args) {
        
        
        BasicEx1 b = new BasicEx1();
        b.disp1();
    }
    
}
