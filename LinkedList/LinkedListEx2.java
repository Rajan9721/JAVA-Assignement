package LinkedList;

import jdk.dynalink.linker.LinkerServices;

public class LinkedListEx2 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);

        if(head == null){
            head = new Node(newData);
            return;
        }

        // node is not empty then
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        LinkedListEx2 lle = new LinkedListEx2();
        lle.insertAtEnd(10);
        lle.insertAtEnd(5);
        lle.display();



    }
}
