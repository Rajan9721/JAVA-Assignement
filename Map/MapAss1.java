package Map;

import java.util.Scanner;
import java.util.TreeMap;

public class MapAss1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of key-Pair: ");
        int n = sc.nextInt();

        TreeMap<Integer, String> tm = new TreeMap<>();

        for(int i = 0; i<n; i++){
            System.out.print("Enter the key "+i+" : ");
            int key = sc.nextInt();
            System.out.print("Enter the value "+i+" : ");
            String val = sc.next();
            tm.put(key, val);
        }

        System.out.println("The value of the map is: "+tm);
    }
}
