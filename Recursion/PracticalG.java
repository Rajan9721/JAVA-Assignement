package Recursion;

public class PracticalG {
    public static int f(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n<=2)
        {
            return 1;
        }
        else
        {
            return f(n-1)+f(n-2)+f(n-3);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(7));

    }
}
