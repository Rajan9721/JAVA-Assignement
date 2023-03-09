class Demo{
    public void a() throws Exception // Ducking
    {
        b();
    }
    public void b() throws Exception // we can write here wich exception is throws Ex: throws ArithmeticException
    // this is called ducking of Exception
    {
        int a = 10;
        int b = 0;
        int result = a/b;
        System.out.println(result);
    }
}
public class ThrowsEx1 {

    public static void main(String[] args) // we can also use here to duck the Exception but this is the wrong way as a good programmer.
    {
        Demo obj = new Demo();
        try{
            obj.a();
        }
        catch(Exception e){ // Exception handel by try catch block
            System.out.println("Error "+e);
        }
        
    }
    
}