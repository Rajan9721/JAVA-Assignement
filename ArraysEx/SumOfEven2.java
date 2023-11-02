package ArraysEx;

    public class SumOfEven2 {
        public static void main(String[] args) {
            int sum = 0;
            int arr[] = {4,3,6,7,1};
            for(int i = 0; i<arr.length; ){
                sum +=arr[i];
                i += 2;
            }
            System.out.println("Sum of even indices: "+sum);
        }
    }
