package LinkedList;

public class LinkedListEx3 {
    Node head;
    class Node{
        int data;
//        next stores the address of the next data
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
//        If list is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

//        When list is not empty
        newNode.next = null;
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

//        It stores the next node reference in the previous node
        temp.next = newNode;
        return;

    }

//    display list data
    public void display(){
        Node temp = head;
//        temp means it stores the current data address.
//        if the list has no data
        if(head == null){
            System.out.println("List is empty");
        }
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        LinkedListEx3 ll3 = new LinkedListEx3();
        ll3.display();
        ll3.insertAtEnd(15);
        ll3.insertAtEnd(20);
        ll3.display();
    }
}
