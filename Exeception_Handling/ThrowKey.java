public class ThrowKey {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;
        try{
            if(num2<0){
                Exception e = new ArithmeticException("Negative Number");
                throw e;
            }
            // or
            /**if(num2<0)
             * {
             * System.out.println("Enter a vlid number");
                 // here this method are use two times second in catch block which is the wrong way of programmig.
                // so we are not using this if block
            }*/

            else{
                int result = num1/num2;
                System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("Enetr a valid number "+e);
        }
    }
    
}
