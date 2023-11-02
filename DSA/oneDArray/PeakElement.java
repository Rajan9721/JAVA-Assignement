package DSA.oneDArray;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,4,7,3,2,6,5};
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
