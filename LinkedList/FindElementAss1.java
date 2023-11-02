package LinkedList;

import java.util.Scanner;

public class FindElementAss1 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public boolean search(int target){
        Node temp = head;
        while(temp!=null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindElementAss1 fe = new FindElementAss1();
        fe.push(6);
        fe.push(21);
        fe.push(17);
        fe.push(30);
        fe.push(10);
        fe.push(8);

        System.out.println("Enter the number you want to search: ");
        int key = sc.nextInt();

        if(fe.search(key)){
            System.out.println(key+" is present in the list or not? = "+"Yes");
        }
        else{
            System.out.println(key+" is present in the list or not? = "+"No");
        }
    }
}
