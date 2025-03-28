package Coding.PrepInsta100Code.Numbers;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year%400==0 || (year%4==0 && year%100!=0)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for(int i=2020;i>=2010;i--){
            if(isLeapYear(i)){
                System.out.println(i);
            }
        }
    }

}
