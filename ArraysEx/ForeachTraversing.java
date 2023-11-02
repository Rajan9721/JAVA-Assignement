package ArraysEx;

public class ForeachTraversing {
    public static void main(String[] args) {
        int arr[] = {34, 21, 54, 65, 43};
        for (int a : arr){
            if(a%2 == 0){
                System.out.println(a);
            }
        }
    }
}
