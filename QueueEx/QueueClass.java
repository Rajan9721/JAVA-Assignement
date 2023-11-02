package QueueEx;

import java.util.LinkedList;
import java.util.Queue;


public class QueueClass {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(8);
//  Before delete element is
        System.out.println("Before deletion elements are: "+queue);
        queue.remove();

//  After deletion elements are:
        System.out.println("After deletion elements are: "+queue);
    }
}
