package ShrayansJain.Collections.Queue.Deque;

import java.util.ArrayDeque;

public class ArrayDequeAsQueueAndStack {
    public static void main(String[] args) {
//FIFO
        ArrayDeque<Integer> arrayDequeAsQueue=new ArrayDeque<>();
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(10);

        //Deletion
        int element=arrayDequeAsQueue.removeFirst();
        System.out.println(element);

        //LIFO(last in first out)
        ArrayDeque<Integer> arrayDequeAsStack=new ArrayDeque<>();
        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(5);
        arrayDequeAsStack.addFirst(10);

        //Deletion
        int removedElem=arrayDequeAsStack.removeFirst();
        System.out.println(removedElem);



    }
}
