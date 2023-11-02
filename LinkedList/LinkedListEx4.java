package LinkedList;

public class LinkedListEx4 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int newData){
            data = newData;
            next = null;
        }
    }

    public void insertData(int newData){
        Node newNode = new Node(newData);

        // If list is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // If Node is not empty
        newNode.next = null;
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    public void display1(){
        Node temp = head;
        if(head == null){
            System.out.println("No data");
        }

        while(temp != null){
            System.out.println(temp.data+ " ");
            temp =  temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListEx4 ll4 = new LinkedListEx4();
        ll4.display1();
        ll4.insertData(2);
        ll4.insertData(10);
        ll4.display1();
    }
}
