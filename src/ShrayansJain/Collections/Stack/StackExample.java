package ShrayansJain.Collections.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //if you are implementing stack with deque it is not thread safe
        //using vector concept method it is thread safe
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
    }
}
