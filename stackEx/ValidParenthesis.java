package stackEx;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean checkParenthesis(String str){
        char ch[] = str.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        for(char ele : ch){
            if(ele == '[' || ele == '{' || ele == '('){
                stack1.push(ele);
                continue;
            }
            else if(stack1.empty()){
                return false;
            }

            char top = stack1.pop();

            if(top == '[' && ele != ']'){
                return false;
            }
            else if(top == '{' && ele != '}'){
                return false;
            }
            else if(top == '(' && ele != ')'){
                return false;
            }
        }
        return (stack1.isEmpty() == true);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("The given string is valid or not?: "+ checkParenthesis(str));

    }

}
