package strings;

import java.util.Scanner;

public class Angram {

    public static char[] arraySort(char[] ch){
        for(int i = 0; i<ch.length-1; i++){
            for(int j = 0;j<ch.length-1; j++){
                if(ch[j]>ch[j+1]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }

        return ch;
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function

        a = a.toLowerCase();
        b = b.toLowerCase();

        char []ch1 = a.toCharArray();
        char []ch2 = b.toCharArray();

        ch1 = arraySort(ch1);
        ch2 = arraySort(ch2);


        for(int i = 0; i<ch1.length; i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
