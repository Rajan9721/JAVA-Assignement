package LinkedList;
import java.util.Scanner;
public class InsertNodeAss2 {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head  = newNode;
    }

    public void insertAtPos(int pos, int key){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(count == pos){
                Node newNode = new Node(key);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertNodeAss2 node = new InsertNodeAss2();
//        inserting nodes from beginning
        node.push(6);
        node.push(5);
        node.push(4);
        node.push(2);
        node.push(1);

        System.out.println("Before inserting the node elements are: ");
        node.display();


        System.out.print("Enter the position: ");
        int pos = sc.nextInt();
        System.out.print("Enter the key for insert: ");
        int key = sc.nextInt();

        node.insertAtPos(pos, key);
        System.out.println("After inserting the node elements are: ");
        node.display();
    }
}
