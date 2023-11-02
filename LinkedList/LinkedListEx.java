package LinkedList;


public class LinkedListEx {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

//    Implementation of insertion node at the given position.
    public void atPosition(int newData, int pos){
        Node temp = head;
        int count = 1;
        while(temp != null){
            temp = temp.next;
            count++;
            if(count == pos){
                Node newNode = new Node(newData);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
        }
    }

//    Implementation of insert element in the first position
    public void insertAtBig(int newData){

//        if(head == null){
//            head = new Node(newData);
//            System.out.println("After adding node at beginning: ");
//            return;
//        }
        System.out.println("After adding the node at beginning: ");
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;

    }

    // Implementation of insertion of a node at the end
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

//   Find middle element of the list
//   two pointer approach
    public void middleElement(){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is: "+slow.data);
    }

    public void removeAnElement(int key){
        Node curr = head , prev = null;

        while(curr!=null && curr.data == key){
            prev = curr.next;
        }
        while(curr!=null){

        }

    }

//Implementation of circular liked list
    public void circularList(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return;
    }

//Floyd's cycle detection algorithms approach
    public void cycleDetection(){
        if(head == null){
            System.out.println("Node is empty");
        }
        Node slow = head, fast = head;
        int flag = 0;
        while(/* fast.next!=null && */ fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("No cycle detection");
        }
        else{
            System.out.println("Cycle detect");
        }

    }

    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListEx ll = new LinkedListEx();
        ll.display();

// Inserting node at the end of the node
        ll.insertAtEnd(10);
        ll.insertAtEnd(15);
        ll.insertAtEnd(50);
        ll.insertAtEnd(20);
        ll.insertAtEnd(6);
        ll.insertAtEnd(9);

// Display after inserting the node at the end
        ll.display();

// Method calling for find middle node of the linked list
        ll.middleElement();

// Cycle detection method calling
        ll.cycleDetection();

// Calling to the method to store the node at the beginning
        ll.insertAtBig(25);

// Display the linked list after adding the new node
        ll.display();

// Calling the method for insertion of a node at the given position
        ll.atPosition(2 ,3);
        ll.display();

    }
}
