package Map;

import java.util.Scanner;
import java.util.TreeMap;

public class MapAss2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for enter the key values: ");
        int n = sc.nextInt();

        // We would simply use TreeMap in Java and will put Strings as key.
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for(int i = 0; i<n; i++){

            System.out.print("key: ");
            int key = sc.nextInt();

            System.out.print("Value: ");
            String val = sc.next();

            treeMap.put(val, key);
        }

        System.out.println(treeMap);
    }
}
