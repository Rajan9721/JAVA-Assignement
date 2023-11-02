package LinkedList;

class Node{
    int data;
    Node next;
    Node(int newData){
        data = newData;
        next = null;
    }
}
public class DeleteDupAss3 {
    Node head;

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
    public void deleteDuplicates() {
        if(head == null || head.next == null)
            return ;
        Node curr = head;

        while( curr != null && curr.next != null){

            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return;
    }
    void PrintList() {
        Node temp = head;
        if(temp != null) {
            System.out.print("The list contains: ");
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
    }

    public static void main(String[] args){
        DeleteDupAss3 dda = new DeleteDupAss3();
        dda.insertAtEnd(1);
        dda.insertAtEnd(1);
        dda.insertAtEnd(2);

        System.out.println("List before deletion: ");
        dda.PrintList();


        dda.deleteDuplicates();
        System.out.println("List after Deletion");
        dda.PrintList();
    }
}
