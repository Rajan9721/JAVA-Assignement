package Recursion;

public class BalanceParenthesis {
    public static void balanceParenthesis(int n, int cc, int oc, String res){
        if(cc == n && oc == n){
            System.out.println(res);
            return;
        }

        if(oc<n){
            balanceParenthesis(n, cc,oc+1, res + "(");
        }
        if(oc>cc){
            balanceParenthesis(n, cc+1, oc,res + ")");
        }
    }
    public static void main(String[] args){
        int cc = 0, oc = 0, n = 2;
        String res = "";
        balanceParenthesis(n, cc, oc, res);

    }
}
