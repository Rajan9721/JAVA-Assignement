package Map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "Shivam");
        map.put(2,"Rajan");
        map.put(3, "Abhishek");
        map.put(4, "Saurabh");
        System.out.println(map);

        String s = (String)map.get(2);
        System.out.println(s);
        System.out.println();

        // For accessing  only key
        Set key = map.keySet();

        Iterator itr = key.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // For accessing values 

        Collection values = map.values();
        Iterator itr2 = values.iterator();
        while(itr2.hasNext()){
            // System.out.println(itr2.next());
            // Or
            String svalues =(String)itr2.next();
            System.out.println(svalues);
        }

        // For accessing both Key and values
        
        Set entry = map.entrySet();

        Iterator itr3 = entry.iterator();

        while(itr3.hasNext()){
            // System.out.println(itr3.next());
            Map.Entry data = (Entry)itr3.next();
            System.out.println(data.getKey()+ " : "+ data.getValue());
        }

    }
}
