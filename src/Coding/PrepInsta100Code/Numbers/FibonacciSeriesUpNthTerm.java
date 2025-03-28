package Coding.PrepInsta100Code.Numbers;

public class FibonacciSeriesUpNthTerm {
    public static int fibonacci(int num){
        if(num<=1) return num;
        return fibonacci(num-1)+fibonacci(num-2);

    }

    public static int[] optimalFibonacci(int n){

        if(n<1) return null;
        int[] arr=new int[n];
        int a=0;
        int b=1;

        arr[0]=a;
        arr[1]=b;
        for(int i=2;i<n;i++){

            int nextElement=a+b;
            a=b;
            b=nextElement;      //returning b is the nth number; but use i<=n
            arr[i]=nextElement;
        }
        return arr;
    }

    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");

        }

        int n2=10;
        int[] result=new int[n2];
        result=optimalFibonacci(n2);
        for(Integer num:result){
            System.out.print(num+" ");

        }
    }
}
