package Exeception_Handling;

public class Launch5 {
    public static void main(String args[])
    {
        try
        {
            System.out.print("Hello" + " " + 1 / 0);
        }
        catch(ArithmeticException e)
        {
            System.out.print("World");
        }
    }
}
