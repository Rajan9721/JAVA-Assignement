package strings;

import java.util.Arrays;

public class SortAlpha {
    public static void main(String[] args) {
        // String str = "RajanRajbhar";
        // str = str.toLowerCase();
        // System.out.println(str);

        // char str1[] = str.toCharArray();
        // System.out.println(str1);
        int a[] = {10,15,4,5,7,1,2};

        for(int i = 0; i<a.length-1; i++){
            for(int j = 0; j<a.length-1-i; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        // Arrays.sort(str1);
        // System.out.println(str1);

        System.out.println(Arrays.toString(a));
        
    }
    
}
