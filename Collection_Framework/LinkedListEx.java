package Collection_Framework;

import java.util.LinkedList;


public class LinkedListEx {
    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        System.out.println(ll);
// Adding in same collection
        ll.add(ll);
        System.out.println("-------------------------------------------------------------");
        System.out.println(ll);
// Hetrogeneous type of data
        LinkedList ll1 = new LinkedList();
        ll1.add(200);
        ll1.add(1.3);
        ll1.add("Java");
        System.out.println("-------------------------------------------------------------");
        System.out.println(ll1);

// Adding collection
        System.out.println("-------------------------------------------------------------");
        System.out.println("After adding collection");
        ll1.add(ll);
        System.out.println(ll1);

// Creating a new LinkedList
        LinkedList ll2 = new LinkedList();
        ll2.add(600);
        ll2.add(300);
        ll2.add(400);
        ll2.add(500);
        System.out.println("-------------------------------------------------------------");
        System.out.println(ll2);

// Using addFirst method 
        ll2.addFirst("Rajan");
        System.out.println("-------------------------------------------------------------");
        System.out.println("After adding: "+ll2);

// Adding an object in last
        ll2.addLast(200);
        System.out.println("-------------------------------------------------------------");
        System.out.println("After adding a value in last: "+ll2);

// remove() method removes from 0th index (first value in the list)
        // ll2.remove();
        // System.out.println("-------------------------------------------------------------");
        // System.out.println(ll2);
        // ll2.remove();
        // System.out.println(ll2);

// peek() : this method return firt object
        System.out.println("-------------------------------------------------------------");
        System.out.println(ll2);
        System.out.println("peek(): "+ll2.peek());

// peekFirst() method return first object of the LinkedList. and peekLast() returns the last object of the LinkedList.
        System.out.println("-------------------------------------------------------------");
        Object f = ll2.peekFirst();  // peekFirst() method returns the first object of the LinkedList.
        Object l = ll2.peekLast();  // peekLast() method returns the last object of the LinkedList.
        System.out.println("peekFirst(): "+f);
        System.out.println("peekLast(): "+l);

// get(index_number), getFirst(), and getLast() method 

        System.out.println("-------------------------------------------------------------");
        System.out.println("Original list is: "+ll2);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Using get(indexNumber) method: "+ll2.get(2));
        System.out.println("-------------------------------------------------------------");
        System.out.println("Using getFirst() method: "+ll2.getFirst());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Using getLast() method: "+ll2.getLast());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Class of ll2: "+ll2.getClass());
        System.out.println("-------------------------------------------------------------");

// use of push method
        ll2.push(20);  // add value at the first
        System.out.println(ll2);
        System.out.println("-------------------------------------------------------------");

// Use of pop method
        ll2.pop();
        System.out.println(ll2); // remove one value from front(first)
        System.out.println("-------------------------------------------------------------");

// indexOf() method use     
        System.out.println(ll2.indexOf(200));
        System.out.println("-------------------------------------------------------------");

// Duplicates are allowed
        ll2.add(400); 
        System.out.println("New List: "+ll2);
        System.out.println("-------------------------------------------------------------");

// lastIndexOf
        System.out.println(ll2.indexOf(400));
        System.out.println(ll2.lastIndexOf(400));

// 
    }   
}
