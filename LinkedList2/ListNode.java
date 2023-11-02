package LinkedList2;

public class ListNode {

   private int data;
   private ListNode next;

   public ListNode(int data){
       this.data = data;
   }
    public void setData(int data) {
        this.data = data;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    public int getData() {
        return data;
    }
    public ListNode getNext() {
        return next;
    }
}
