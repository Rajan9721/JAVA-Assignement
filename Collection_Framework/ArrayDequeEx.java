package Collection_Framework;

import java.util.*;

public class ArrayDequeEx {
    public static void main(String[] args) {
         ArrayDeque ad = new ArrayDeque();
         ad.add(100);
         ad.add(200);
         ad.add(300);
         
         System.out.println(ad);
 // // Adding in same coadection
 //         ad.add(ad);
 //         System.out.println("-------------------------------------------------------------");
 //         System.out.println(ad);

 // hetrogeneous type of data
         ArrayDeque ad1 = new ArrayDeque();
         ad1.add(200);
         ad1.add(1.3);
         ad1.add("Java");
         System.out.println("-------------------------------------------------------------");
         System.out.println(ad1);

 // Adding collection
         System.out.println("-------------------------------------------------------------");
         System.out.println("After adding collection");
         ad1.add(ad);
         System.out.println(ad1);

 // Creating a new ArrayDeque
         ArrayDeque ad2 = new ArrayDeque();
         ad2.add(600);
         ad2.add(300);
         ad2.add(400);
         ad2.add(500);
         System.out.println("-------------------------------------------------------------");
         System.out.println(ad2);

 // Using addFirst method
         ad2.addFirst("Rajan");
         System.out.println("-------------------------------------------------------------");
         System.out.println("After adding: "+ad2);

 // Adding an object in last
         ad2.addLast(200);
         System.out.println("-------------------------------------------------------------");
         System.out.println("After adding a value in last: "+ad2);

 // remove() method removes from 0th index (first value in the list)
//         ad2.remove();
//         System.out.println("-------------------------------------------------------------");
//         System.out.println(ad2);
//         ad2.remove();
//         System.out.println(ad2);

 // peek() : this method return first object
         System.out.println("-------------------------------------------------------------");
         System.out.println(ad2);
         System.out.println("peek(): "+ad2.peek());

 // peekFirst() method return first object of the ArrayDeque. and peekLast() returns the last object of the ArrayDeque.

         Object f = ad2.peekFirst();  // peekFirst() method returns the first object of the ArrayDeque.
         Object l = ad2.peekLast();  // peekLast() method returns the last object of the ArrayDeque.
         System.out.println("peekFirst(): "+f);
         System.out.println("peekLast(): "+l);

 // get(index_number), getFirst(), and getLast() method

         System.out.println("-------------------------------------------------------------");
         System.out.println("Original list is: "+ad2);
         System.out.println("-------------------------------------------------------------");
//         System.out.println("Using get(indexNumber) method: "+ad2.get(2));  // Not allowed
//         System.out.println("-------------------------------------------------------------");
         System.out.println("Using getFirst() method: "+ad2.getFirst());
         System.out.println("-------------------------------------------------------------");
         System.out.println("Using getLast() method: "+ad2.getLast());
         System.out.println("-------------------------------------------------------------");
         System.out.println("Class of ad2: "+ad2.getClass());
         System.out.println("-------------------------------------------------------------");

 // use of push method
         ad2.push(20);  // add value at the first
         System.out.println(ad2);
         System.out.println("-------------------------------------------------------------");

 // Use of pop method
         ad2.pop();
         System.out.println(ad2); // remove one value from front(first)
         System.out.println("-------------------------------------------------------------");


 // Duplicates are aadowed
         ad2.add(400);
         System.out.println("New List: "+ad2);
         System.out.println("-------------------------------------------------------------");

 // Index based accessing not aadowed in ArrayDeque because we can not add data indexbased in the ArrayDeque
        

 // Insertion by index number not aadowed in ArrayDeque
       
    }
    
}
