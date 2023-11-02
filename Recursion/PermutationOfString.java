package Recursion;

public class PermutationOfString {
    // Swap the given string
    public static String swapString(String str, int i, int j){
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
    public static void permuteString(String str, int l, int r){
// Base case condition
        if(l == r){
            System.out.println(str);
        }
// Recursion
        else{
            for(int i = l; i<=r; i++){
                str = swapString(str, l, i);
                permuteString(str, l+1, r);


                // Backtrack♥◘○•♦♣♠☺☻♥
                str = swapString(str, l, i);
            }
        }
    }
    public static void main(String[] args) {
        String str = "1423";
        int l = 0;
        int r = str.length()-1;
        permuteString(str, l, r);

    }
}
