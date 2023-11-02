package Recursion;

public class TilingProblem {
    public static int tilingWay(int n){
        if(n<=3){
            return n;
        }
        return tilingWay(n-1)+tilingWay(n-2);
    }
    public static void main(String[] args){
        String str = "";
        int res = tilingWay(5 );
        System.out.println("Ways:= " +res);
    }
}
