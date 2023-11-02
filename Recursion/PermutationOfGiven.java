package Recursion;

public class PermutationOfGiven {

    public static String swap(String str, int i, int j){
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }

    public static void permute(String str, int l, int r){
        if(l == r){
            System.out.println(str);
        }
        else{
            for (int i = l; i<=r; i++){
                str = swap(str, l, i);
                permute(str, l+1, r);

//                Backtrack
                str = swap(str, l, i);
            }
        }
    }
    public static void main(String[] args) {
        String str = "AB";
        int l = 0;
        int r = str.length()-1;
        permute(str, l, r);
    }
}
