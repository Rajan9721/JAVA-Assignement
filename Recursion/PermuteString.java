package Recursion;

public class PermuteString {
    public static String swapStr(String str, int i, int j){
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void permuteStr(String str, int l, int r){
        if(l==r){
            System.out.println(str);
        }
        else{
            for(int i = l; i<=r; i++){
                str = swapStr(str, l, i);
                permuteStr(str, l+1, r);
                // Backtrack
                str = swapStr(str, l, i);
            }
        }
    }
    public static void main(String[] args){
        String str = "ABCD";
        int l = 0;
        int r = str.length()-1;
        permuteStr(str, l, r);
    }
}
