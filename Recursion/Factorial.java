package Recursion;

public class Factorial {
    int res = 0;
    public int fact(int n){
        if(n == 0 || n==1){
            return 1;
        }
        else{
            res = n*fact(n-1);
        }

        return res;
    }
    public static void main(String[] args) {
        Factorial fact1 = new Factorial();
        System.out.println(fact1.fact(5));
    }
}
