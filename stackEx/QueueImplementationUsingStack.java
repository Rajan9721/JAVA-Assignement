package stackEx;

import java.util.Stack;

public class QueueImplementationUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

//    time complexity = O(1)
    public void enQueue(int data){
        stack1.push(data);
    }
    public int deQueue(){
        int ele;
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty.");
            System.exit(0);
        }

//        time complexity = O(n)
        if(stack2.empty()){
            while(!stack1.isEmpty()){
                ele = stack1.pop();
                stack2.push(ele);
            }
        }
        ele = stack2.pop();
        return ele;
    }
    public void display(){
            System.out.println(stack1);
    }
    public static void main(String[] args) {
        QueueImplementationUsingStack queueEx = new QueueImplementationUsingStack();
        queueEx.enQueue(10);
        queueEx.enQueue(12);
        queueEx.enQueue(13);
        System.out.println(queueEx.deQueue());
        System.out.println(queueEx.deQueue());
        queueEx.enQueue(15);
        System.out.println(queueEx.deQueue());
    }
}

