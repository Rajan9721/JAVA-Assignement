package ArraysEx;

public class MaxValue {
    public static void main(String[] args) {
        int arr[] = {34, 21, 54, 65, 43};
        int max = arr[0];
        int count = 0;
       for(int i = 0; i<arr.length; i++){
           if(arr[i]>max){
               max = arr[i];
           }
       }
        System.out.println(max);
    }
}
