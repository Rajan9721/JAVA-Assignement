package QueueEx;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementation {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

//    To add the element in the stack
//    Time complexity = O(n)
    public void enQueue(int data){
//      1) Move all element from queue1 to queue2.
        while(!queue1.isEmpty()){
            queue2.add(queue1.peek());
//          poll() method is also used to remove the element from the queue.
//          return null if the queue is empty.
            queue1.poll();
        }

//      2) Push the new data to the queue1.
        queue1.add(data);

//      3) Move all element from q2 to q1.
        while(!queue2.isEmpty()){
            queue1.add(queue2.peek());
            queue2.poll();
        }
    }

//    To delete the element from the stack.
//    Time complexity to delete the element is O(1).
    public int deQueue(){
        if(queue1.isEmpty()){
            System.out.println("Stack is underflow.");
            System.exit(0);
        }
//        return queue1.poll();
//        or
        int ele = queue1.peek();
        queue1.poll();
        return ele;
    }

    public void display(){
        while(!queue1.isEmpty()){
            System.out.println(queue1.element());
            queue1.poll();
        }
    }
    public static void main(String[] args){
        StackImplementation st = new StackImplementation();

//        push all the element in the stack
        st.enQueue(10);
        st.enQueue(15);
        st.enQueue(23);

        st.display();

//        delete the element from the stack.
        System.out.println(st.deQueue());
        System.out.println(st.deQueue());
        System.out.println(st.deQueue());
        System.out.println(st.deQueue());
        System.out.println(st.deQueue());
        System.out.println(st.deQueue());


    }
}
