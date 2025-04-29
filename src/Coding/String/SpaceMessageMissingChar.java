package Coding.String;
/*Sample Input 0

SOSSPSSQSSOR
Sample Output 0

3
Explanation 0

 = SOSSPSSQSSOR, and signal length . They sent  SOS messages (i.e.: ).

Expected signal: SOSSOSSOSSOS
Recieved signal: SOSSPSSQSSOR
Difference:          X  X   X*/
public class SpaceMessageMissingChar {
    public static int marsExploration(String s) {
        // Write your code here
        int count=0;
        for(int i=0;i<s.length();i++){
            if(i%3==1){
                if(s.charAt(i)!='O'){
                    count++;
                }
            }
            else{
                if(s.charAt(i)!='S'){
                    count++;
                }

            }
        }
        return count;

    }

    public static void main(String[] args) {
        String s="SOSSTSSUS";
        System.out.println(marsExploration(s));//2
    }

}
