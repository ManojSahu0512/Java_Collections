package ShrayansJain.Collections.List.LinkedList;

import java.util.LinkedList;
/*
* deque and List interface both are implementing
* */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        //using deque functionality
        list.addFirst(200);
        list.addFirst(300);
        list.addFirst(400);
        list.addFirst(100);
        System.out.println(list.getFirst());

        //using list functionality
        LinkedList<Integer> list2=new LinkedList<>();
        list2.add(0,100);
        list2.add(1,300);
        list2.add(2,400);
        list2.add(1,200);
        System.out.println(list2.get(1)+"and "+list2.get(2));
    }
}
