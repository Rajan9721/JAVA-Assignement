package LinkedList2;

public class Main {

    public static void display(ListNode head){
        if(head == null){
            return;
        }

        while(head!=null){
            System.out.print(head.getData()+ " -> ");
            head  = head.getNext();
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(15);
        ListNode node3 = new ListNode(25);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        display(head);

    }
}
