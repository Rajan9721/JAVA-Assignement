package Static;

import java.util.Scanner;

class Solution {
    int equalSum(int[] A, int N) {

        int total_sum = 0, left_sum = 0;
    for (int i = 0; i < N; i++) {
        total_sum += A[i];
    }
    for (int i = 0; i < N; i++) {
        int right_sum = total_sum - left_sum - A[i];
        if (left_sum == right_sum) {
            return i + 1; // Return 1-based index
        }
        left_sum += A[i];
    }
    return -1;
    }
}

// Implementation
// Calculate the total sum of elements in the array, let's call it 'total sum'.
// Initialize a variable called 'left_sum' to 0.
// Traverse the array from left to right, for each index 'i':
// Calculate the 'right_sum' as total_sum - left_sum - A[i].
// If left_sum is equal to right_sum, then we have found the index we are looking for, which is 'i'. Return 'i+1'.(As 1 based indexing is there)
// Otherwise, add A[i] to 'left_sum' and continue to the next index.
// If no index is found in step 3, return -1 to indicate that there is no such index.

public class Test {
    public static void main(String[] args) {
        Solution sn = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(sn.equalSum(a, n));
        
    }

}
