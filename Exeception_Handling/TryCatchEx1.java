public class TryCatchEx1{
    public static void main(String args[])
    {
        int num1 = 25;
        int num2 = 0;
        int result = 0;
        try{
            result = num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println("Enter a valid number number can not be "+e.getMessage());
        }
        
        System.out.println(result);
    }
}