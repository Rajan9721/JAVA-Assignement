package Hash_Map;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result[] = new int[2];
        int flag = 0;
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the array element: ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i<n; i++){
           hashMap.put(arr[i], i);
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        for(int i = 0; i<n; i++){
            if(arr[i] == target && hashMap.containsKey(0)){
                flag = 1;
                result[0] = i;
                result[1] = hashMap.get(0);
                break;
            }
            else if (hashMap.containsKey(target-arr[i])){
                if (hashMap.get(target-arr[i])>i){
                    flag = 1;
                    result[0] = i;
                    result[1] = hashMap.get(target-arr[i]);
                    break;
                }
            }
        }

        if(flag == 1){
            System.out.println("Result : "+"["+result[0]+":"+result[1]+"]");
        }
        else {
            System.out.println("Two Sum not available.");
        }
    }
}
