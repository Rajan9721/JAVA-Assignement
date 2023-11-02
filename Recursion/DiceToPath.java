package Recursion;

public class DiceToPath {

    public static void path(int dest, int curr, String res){

//        Negative base case condition
        if(curr>dest){
            return;
        }
//        Positive base case condition
        if(curr == dest){
            System.out.println(res);
            return;
        }
//        recursive calls for 6 choice we need 6 recursion calls
        path(dest, curr+1, res+1);
        path(dest, curr+2, res+2);
        path(dest, curr+3, res+3);
        path(dest, curr+4, res+4);
        path(dest, curr+5, res+5);
        path(dest, curr+6, res+6);
    }
    public static void main(String[] args) {
        int dest = 9, curr = 0 , count = 0;
        String ans = "";
        path(dest, curr, ans);

    }
}
