package Arrays;

public class DefaultValues {
    public static void main(String[] args) {
        System.out.println("String array default values:");

        String str[] = new String[5];
        for (String s : str)
            System.out.print(s + " ");
         

        System.out.println("\n\nInteger array default values:");

        int num[] = new int[5];
    
        for (int val : num)
            System.out.print(val + " ");

        System.out.println("\n\nDouble array default values:");

        double dnum[] = new double[5];
        for (double val : dnum)
            System.out.print(val + " ");

        System.out.println("\n\nBoolean array default values:");

        boolean bnum[] = new boolean[5];
        for (boolean val : bnum)
            System.out.print(val + " ");

        System.out.println("\n\nchar array default values");

        char ch[] = new char[5];
        for(char val : ch)
            System.out.print(val+" ");


        System.out.println("\n\nReference Array default values:");
        
        DefaultValues dv[] = new DefaultValues[5];
        for (DefaultValues val : dv)
            System.out.print(val + " ");


    }

}
