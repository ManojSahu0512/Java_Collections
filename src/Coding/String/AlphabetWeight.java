package Coding.String;

import java.util.*;

/*
* A weighted string is a string of lowercase English letters where each letter has a weight. Character weights are  to  from  to  as shown below:
*
.

Working from left to right, weights that exist are:

string  weight
a       1
b       2
bb      4
c       3
cc      6
ccc     9
d       4
dd      8
ddd     12
dddd    16*/
public class AlphabetWeight {
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here

        Map<Character,Integer> frequency=new HashMap<>();

        for(char ch:s.toCharArray()){
            frequency.put(ch, frequency.getOrDefault(ch, 0)+1);

        }
        List<Integer> sum=new ArrayList<>();
        for(Character ch: frequency.keySet()){
            int value=frequency.get(ch);
            for(int i=1;i<=value;i++)
            {
                sum.add(((int) ch-97+1)*i);//1 based index
            }

        }

        List<String> result=new ArrayList<>();

        for (Integer query : queries) {
            int flag = 0;

            for (Integer integer : sum) {
                if (Objects.equals(query, integer)) {
                    result.add("Yes");
                    flag = 1;
                }
            }
            if (flag != 1) {
                result.add("No");
            }


        }
        return result;
    }public static List<String> weightedUniformStringsOptimal(String s, List<Integer> queries) {
        // Write your code here
        Set<Integer> weights=new HashSet<>();
        char prevChar='\0';
        int currentWeight=0;
        for(int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            if(currentChar==prevChar){
                currentWeight+=(currentChar-'a'+1);
            }
            else{
                currentWeight=(currentChar-'a'+1);
            }
            weights.add(currentWeight);
            prevChar=currentChar;

        }
        List<String> result=new ArrayList<>();
        for(Integer num:queries){

            if(weights.contains(num)){
                result.add("Yes");
            }
            else{
                result.add("No");
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String s="abbcccdddd";
        List<Integer> queries=Arrays.asList(1,7,5,4,15);
        for(String str:weightedUniformStrings(s,queries)){
            System.out.print(str+" ");
        }
        String s1="abbcccdddd";
        List<Integer> queries1=Arrays.asList(1,7,5,4,15);
        for(String str:weightedUniformStrings(s1,queries1)){
            System.out.println(str+" ");
        }
    }

}
