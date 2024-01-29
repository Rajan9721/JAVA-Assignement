package LinkedList2;

class ListNode2{

    int val;
    ListNode2 next;

    ListNode2(int val){
        this.val = val;
        next = null;
    }

}
public class TwoSum {

    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        ListNode2 res = new ListNode2(0);
        ListNode2 head = res;
        int carry = 0;

        while(l1 != null || l2 != null){

            int sum = 0 + carry;

            if(l1!=null){
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                sum = sum + l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            sum = sum%10;
            res.next = new ListNode2(sum);
            res = res.next;
        }

        if(carry == 1){
            res.next = new ListNode2(carry);
            res = res.next;
        }

        return head.next;
    }
    public static void main(String[] args) {
        

    }
    
}

