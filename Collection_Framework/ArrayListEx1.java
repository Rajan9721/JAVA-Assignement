package Collection_Framework;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(10);
        al.add(20);
        al.add(200);

        System.out.println(al);
        // Output: [100, 10, 20, 200]
        // it means arrayList can store homogeneous type of data 

        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add("Java");
        al1.add('J');
        al1.add(1.3);

        System.out.println(al1);

        // Output : [100, Java, J, 1.3]
        // it means ArrayList also can store Hetrogeneous type of data
        

    }
    
}
