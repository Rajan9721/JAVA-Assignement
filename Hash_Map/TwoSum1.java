package Hash_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the array element: ");
        int arr[] = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

//        HashMap implementation
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(arr[i], i);
        }

//        For storing result we need to create an array
        int result[] = new int[2];
        for(int i = 0; i<n; i++){
            if(map.containsKey(target-arr[i]) && map.containsKey(0)){
                result[0] = i;
                result[1] = map.get(0);
                break;
            }
            if(map.containsKey(target-arr[i])){
                if(map.get(target-arr[i])>i){
                    result[0] = i;
                    result[1] = map.get(target-arr[i]);
                    break;
                }
            }
        }
        System.out.println("Result: ["+result[0]+":"+result[1]+"]");
    }
}
