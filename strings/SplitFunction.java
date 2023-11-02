package strings;

public class SplitFunction {
    public static void main(String args[])
    {
        String str = "geeks@for@geeks";
        String[] arrOfStr = str.split("@");

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
