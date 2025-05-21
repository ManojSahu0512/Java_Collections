package ShrayansJain.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListAllMethods {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();

        //add(int index,Element e)
        list1.add(0,100);
        list1.add(1,200);
        list1.add(2,300);

        //addAll(index,Collection c)
        List<Integer> list2=new ArrayList<>();
        list2.add(0,400);
        list2.add(1,500);
        list2.add(2,600);

        list1.addAll(2,list2);

        list1.forEach((Integer num)-> System.out.println(num));

        //replaceAll(UnaryOperator op)
        list1.replaceAll((Integer value)->-1*value);
        System.out.println("after replace all:");
        list1.forEach((Integer num)-> System.out.println(num));

        //sort(Comparator c)
        list1.sort((Integer val1,Integer val2)->val1-val2);

        System.out.println("After sorting in increasing order");
        list1.forEach((Integer val)-> System.out.println(val));

        //get(int index)
        System.out.println("value present at index 2 is:"+list1.get(2));

        //indexOf(Object e)
        System.out.println("index of -200 value is: "+list1.indexOf(-200));//first occurrence
        System.out.println("index of -200 value in last occurrence :"+list1.lastIndexOf(-200));


        //need to provide the index in listIterator from where it has to start
        ListIterator<Integer> listIterator1=list1.listIterator(list1.size());

        //traversing backward direction
        while (listIterator1.hasPrevious()){
            int previousValue=listIterator1.previous();
            System.out.println("Traversing backward :"+previousValue+"nextIndex:"+listIterator1.nextIndex()+"previous index"+listIterator1.previousIndex());
            if(previousValue==-100){
                listIterator1.set(-50);
            }
        }
        list1.forEach((Integer val)-> System.out.println("after set "+val));

        //traversing forward direction
        ListIterator<Integer> listIterator2=list1.listIterator();//child of Iterator class
        while(listIterator2.hasNext()){
            int val=listIterator2.next();
            System.out.println("Traversing forward "+val+"nextIndex "+listIterator2.nextIndex()+"previous index"+listIterator2.previousIndex());
            if(val==-200){
                listIterator2.add(-100);
            }

        }
        list1.forEach((Integer num)-> System.out.println("after add:"+num));

        //sublist

        List<Integer> subList=list1.subList(1,4);//4 is excluded
        subList.forEach((Integer num)-> System.out.println("sublist: "+num));

        subList.add(-900);
        list1.forEach((Integer val)-> System.out.println("after value added in sublist"+val));



//100
//200
//400
//500
//600
//300
//after replace all:
//-100
//-200
//-400
//-500
//-600
//-300
//After sorting in increasing order
//-600
//-500
//-400
//-300
//-200
//-100
//value present at index 2 is:-400
//index of -200 value is: 4
//index of -200 value in last occurrence :4
//Traversing backward :-100nextIndex:5previous index4
//Traversing backward :-200nextIndex:4previous index3
//Traversing backward :-300nextIndex:3previous index2
//Traversing backward :-400nextIndex:2previous index1
//Traversing backward :-500nextIndex:1previous index0
//Traversing backward :-600nextIndex:0previous index-1
//after set -600
//after set -500
//after set -400
//after set -300
//after set -200
//after set -50
//Traversing forward -600nextIndex 1previous index0
//Traversing forward -500nextIndex 2previous index1
//Traversing forward -400nextIndex 3previous index2
//Traversing forward -300nextIndex 4previous index3
//Traversing forward -200nextIndex 5previous index4
//Traversing forward -50nextIndex 7previous index6
//after add:-600
//after add:-500
//after add:-400
//after add:-300
//after add:-200
//after add:-100
//after add:-50
//sublist: -500
//sublist: -400
//sublist: -300
//after value added in sublist-600
//after value added in sublist-500
//after value added in sublist-400
//after value added in sublist-300
//after value added in sublist-900
//after value added in sublist-200
//after value added in sublist-100
//after value added in sublist-50
//
//Process finished with exit code 0




    }
}
