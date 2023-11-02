package Hash_Map;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {
    public static void main(String[] args){

        HashMap<Integer, Integer> stringMap = new HashMap<>();
        stringMap.put(5,10);
        stringMap.put(3,15);
        stringMap.put(2,20);
        stringMap.put(6,26);
        stringMap.put(4,3);
        System.out.println("HashMap -"+stringMap);

        LinkedHashMap<Integer, Integer> stringMap1 = new LinkedHashMap<>();
        stringMap1.put(5,10);
        stringMap1.put(3,15);
        stringMap1.put(2,20);
        stringMap1.put(6,26);
        stringMap1.put(4,3);
        System.out.println("LinkedHashMap: - "+stringMap1);

        TreeMap<Integer, Integer> stringMap2 = new TreeMap<>();
        stringMap2.put(5,10);
        stringMap2.put(3,15);
        stringMap2.put(2,20);
        stringMap2.put(6,26);
        stringMap2.put(4,6);
        System.out.println("TreeMap: - "+stringMap2);

    }
}
