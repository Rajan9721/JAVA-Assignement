package Hash_Map;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Rajan");
        hashMap.put(5, "MCA");
        hashMap.put(6, "National University");

//        Functionality of get() method.
        System.out.println(hashMap.get(1));

//        Functionality of values() method to get all the values.
        System.out.println(hashMap.values());

//        Functionality of entrySet() to iterate over the hashMap().
        for(Map.Entry<Integer, String> e : hashMap.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }


    }
}
