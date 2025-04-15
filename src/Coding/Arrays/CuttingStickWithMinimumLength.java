package Coding.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuttingStickWithMinimumLength {
    public static List<Integer> cutTheSticks(List<Integer> arr){
        List<Integer> result=new ArrayList<>();
        while(!arr.isEmpty()){
            List<Integer> newList=new ArrayList<>();
            int length=arr.size();
            result.add(length);
            int minValue=arr.stream().min(Integer::compare).orElse(0);
            for(Integer num:arr){
                int remainValue=num-minValue;
                if(remainValue>0){
                    newList.add(remainValue);
                }
            }
            arr=newList;

        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(5, 4, 4, 2, 2, 8);
        List<Integer> result=cutTheSticks(list);

        for(Integer num:result){
            System.out.println(num);
        }
    }
}
