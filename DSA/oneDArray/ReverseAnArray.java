package DSA.oneDArray;

public class ReverseAnArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 10, 11};
        int n = arr.length;

        for(int i = 0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }


}
