package stackEx;

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.push(15);

        int res = stack.get(0);
        System.out.println(res);

//        Print top most element from the stack.
        System.out.println("Before deletion Element at the topmost position: "+stack.peek());

//        Delete at top most element from the stack.
        System.out.println("Deleting element: "+stack.pop());

//        Print the top most element from the stack.
        System.out.println("After deletion at topmost element is: "+stack.peek());

//        Search an element is the stack.
//        Search function return -1 when the element is not present in the stack.
        System.out.println("Finding element by search method: "+stack.search(10));

//        check the stack is empty or not
//        empty function returns the boolean value.
        System.out.println("The stack is empty or not?: "+stack.isEmpty());

    }
}
