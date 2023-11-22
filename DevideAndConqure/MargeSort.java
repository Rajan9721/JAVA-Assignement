package DevideAndConqure;

import java.util.Scanner;

public class MargeSort {

    public static void mergeProcedure(int arr[], int l, int mid, int r) {
        int i, j, k;
        // n1 - size of left subarray
        // n2 - size of right subarray
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // create a left and right subarray
        int[] lsubarray = new int[n1];
        int[] rsubarray = new int[n2];

        // copy the elements into left and right subarray
        for(i=0; i<n1; i++){
            lsubarray[i] = arr[l+i];
        }

        for(j=0; j<n2; j++){
            rsubarray[j] = arr[mid + 1 + j];
        }

        // comparison among elements in the left and right subarray
        i=0;
        j=0;
        k=l;

        while(i < n1 && j < n2){
            if(lsubarray[i] <= rsubarray[j]){
                arr[k] = lsubarray[i];
                i = i+1;
            }
            else{
                arr[k] = rsubarray[j];
                j = j + 1;
            }
            k = k + 1;
        }

        // copy the remaining elements from left subarray
        while(i < n1){
            arr[k] = lsubarray[i];
            i = i+1;
            k = k+1;
        }

        // copy the remaining elements from right subarray
        while(j < n2){
            arr[k] = rsubarray[j];
            j = j + 1;
            k = k +1;
        }
}

    public static void mergeSort(int arr[], int l, int r){

        if(l<r){

            // 1. Divide the array into various subproblems
            int mid = l+(r-l)/2;

            // 2. Conquer the subproblems via the recursion.
            // left subarray : recursive call
            mergeSort(arr, l, mid);

            // right subarray - recursive call
            mergeSort(arr, mid+1, r);

            // 3. Combine - mergeProcedure
            mergeProcedure(arr, l, mid, r);
        }
    }

    public static void displayArray(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n-1);

        displayArray(arr, n);
    }
}
