package Coding.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static int[] bruteForceSolution(int[] arr){
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }




            }

            if(leader){
                result.add(arr[i]);

            }

        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }
    public static int[] optimalSolution(int[] arr){
        List<Integer> res=new ArrayList<>();
        int max=-1;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                res.add(arr[i]);
            }

        }
        return res.stream().sorted((a,b)->b-a).mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr={22,12,15,11,5,6,2,1};
        int[] result=bruteForceSolution(arr);
        for (int num:result){
            System.out.println(num);
        }

        int[] optimalRes=optimalSolution(arr);
        for (int num:optimalRes){
            System.out.println(num);
        }

    }
}
