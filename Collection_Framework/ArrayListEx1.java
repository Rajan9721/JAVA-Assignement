package Collection_Framework;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {

// homogeneous type of data 
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(10);
        al.add(20);
        al.add(200);

        System.out.println(al);

        System.out.println("*********************************************");

// Hetrogeneous type of data
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add("Java");
        al1.add('J');
        al1.add(1.3);

        System.out.println(al1);
        System.out.println("*********************************************");


// Duplicate Allowed
        al1.add(100); 
        System.out.println(al1);

        System.out.println("*********************************************");

// index based insersion
        al1.add(2, "Program"); 

        System.out.println(al1);

        System.out.println("*********************************************");
        System.out.println("After adding collection in al1");

// adding a Collection  
        al1.addAll(al);
        System.out.println(al1);

        System.out.println("New ArrayList");

        ArrayList al2 = new ArrayList();
        al2.add(10);
        al2.add(100);
        al2.add(20);
        al2.add(200);


        ArrayList al3 = new ArrayList();
        al3.add(20);
        al3.add(10);
        al3.add(100);
        al3.add(200);

// find Size of the ArrayList
        int a = al2.size();
        System.out.println("ArrayList: "+al2);
        System.out.println("Size of the ArrayList al2 is: "+a);

// Accessing object by index
        Object b = al2.get(2);
        System.out.println("At index 2 Value is: "+b);

// Clear all values from arraylist
        // al2.clear();
        // System.out.println(al2);

// Copy of collection
        Object copyCollection = al2.clone();
        System.out.println(copyCollection);

// Find value are persent or not
        boolean value = al2.contains(1000);
        System.out.println("Value is persent: "+value);

// Two Collections are eguals or not  
        System.out.println("Collection are equals: "+al2.equals(al1));

// collection to be checked for containment in this collection

        System.out.println("al2: "+al2);
        System.out.println("al3: "+al3);
        System.out.println("All object are same: "+al2.containsAll(al3)); // Order are not mandatory its compare values

// Check indexOf values
        int index = al2.indexOf(200);
        System.out.println("Index of 200 in al2: "+index);
        
// How to define capcity of ArrayList
        al2.ensureCapacity(10);
        
// Remove the null spaces 
        al2.trimToSize();

    }
    
}
