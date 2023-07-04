package DSA.oneDArray;

public class Palindrome {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 1, 2, 1};
        int l = array.length;
        int flag = 0;
        for(int i = 0; i<l/2; i++){
            if(array[i] != array[l-1-i]){
                flag = 1;
                System.out.println("Not a palindrome number");
                break;
            }
        }
        if(flag == 0){
            System.out.println("Palindrome number");
        }
    }
}
