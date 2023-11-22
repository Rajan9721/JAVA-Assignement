package QueueEx;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementation {

    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(10);
        deque.add(15);
        deque.add(9);

        System.out.println(deque);
    }
}
