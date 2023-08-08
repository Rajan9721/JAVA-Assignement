package strings;

public class Palindrome {
    public static void main(String[] args){
        char[] num = "2552".toCharArray();
        int n = num.length;
        boolean temp = false;
        for (int i = 0; i< n/2; i++){

            if(num[i] != num[n-i-1]){
                temp = true;
            }
        }
        if(temp == true){
            System.out.println("number is not palindrome");
        }
        else{
            System.out.println("Number is palindrome");
        }

    }
}
