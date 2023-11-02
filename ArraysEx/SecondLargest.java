package ArraysEx;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int a[] = {34,21,54,65,43};
        int l = a.length;
        Arrays.sort(a);
        System.out.println("Second largest number is: "+a[l-2]);
    }
}
