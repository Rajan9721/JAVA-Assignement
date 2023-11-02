package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void insertAtEnd(int newData){

        Node newNode = new Node(newData);
        // Implementation If node is empty
        if(head == null){
            head = new Node(newData);
            return;
        }
        // if node is not empty then
        newNode.next = null;
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

//   Implementation for finding the given value(key) is present in the list or not.
    public boolean checkKey(Node head, int key){
        Node temp = head;
//   Traversing in the linked ist
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

//    Implementation for finding number is palindrome or not.
    public boolean palindrome(Node head){
        List<Integer> arrayList = new ArrayList<>();
        Node temp = head;
        while (temp != null){
            arrayList.add(temp.data);
            temp = temp.next;
        }
        int low = 0;
        int high = arrayList.size()-1;

        while(low<high){
            if(!arrayList.get(low).equals(arrayList.get(high))){
                return false;
            }
            low = low+1;
            high = high-1;
        }
        return true;
    }

// Method to display the data in the linked list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }
    }

//    Implementation of main method
    public static void main(String[] args) {
        Palindrome pm = new Palindrome();
        pm.insertAtEnd(10);
        pm.insertAtEnd(21);
        pm.insertAtEnd(11);
        pm.insertAtEnd(30);
        pm.insertAtEnd(14);
        pm.display();

//      calling the function to Find given number is palindrome or not.
        boolean result = pm.palindrome(pm.head);
        if(result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

//      Calling function to find the given value is present in the linked list or not.
        boolean res = pm.checkKey(pm.head, 14);
        String s = (res)?"Yes":"No";

        System.out.println("Key is present: "+s);
    }
}
