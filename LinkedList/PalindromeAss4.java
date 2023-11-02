package LinkedList;

import java.util.ArrayList;

public class PalindromeAss4 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

//    Inserting an element.
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = new Node(newData);
            return;
        }
        // List is not empty
        newNode.next = null;
        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return;
    }

    public boolean isPalindrome(Node head){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
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
    
    public static void main(String[] args){
        PalindromeAss4 pa = new PalindromeAss4();

        pa.insertAtEnd(1);
        pa.insertAtEnd(2);

        System.out.println(pa.isPalindrome(pa.head));

    }
}
