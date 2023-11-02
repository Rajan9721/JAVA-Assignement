package Recursion;

public class SumOfValues{
    public static int sumOfValues(int[] a, int n){
        int result = 0;
        if(n<=0){
            return 0;
        }
        else{
            result = sumOfValues(a,n-1) + a[n-1];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {92, 23, 15, -20, 10};
        int result = sumOfValues(arr, arr.length);
        System.out.println("Result is: "+result);
    }
}
