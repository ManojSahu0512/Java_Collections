package DSA.Stack;

import java.util.Stack;

public class BasicStackExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        // Pushing elements
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //
        //peek() - returns the top element without removing it
        int top=stack.peek();
        System.out.println(top);//

        // Popping elements
        //System.out.println(stack.pop());//3
        int last =stack.pop();
        System.out.println(last);//3
        System.out.println(stack.pop());//2
        System.out.println(stack.pop());//1

        //empty() - checks if stack is empty

        System.out.println(stack.empty());//true

    }
}
