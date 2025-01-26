package ExceptionHandling;

//What is Exception in Java?
//In Java, an exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. These exceptions can occur for various reasons, such as invalid user input, file not found, or division by zero. When an exception occurs, it is typically represented by an object of a subclass of the java.lang.Exception class.

//Types of Java Exceptions
//In Java, exceptions are categorized into two main types: checked exceptions and unchecked exceptions. Additionally, there is a third category known as errors. Let's delve into each of these types:
//
//Checked Exception
//Unchecked Exception
//Error

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionExample {
    public static void main(String[] args) {

        //1) A scenario where ArithmeticException occurs

        try{
            int div=100/0;
            System.out.println(div);


        }catch (ArithmeticException exp){
            System.out.println(exp);
            System.out.println("Division by 0 is not allowed:"+exp);

        };


        //2) A scenario where NullPointerException occurs

      try{
          String str=null;
          System.out.println(str.length());
      }catch (NullPointerException exp){

          System.out.println("Error: Null reference encountered."+exp);

      };
      //3) A scenario where NumberFormatException occurs
        String s="acb";
        try{
            int i=Integer.parseInt(s);

            System.out.println(i);
        }
        catch (NumberFormatException exp){
            System.out.println("Error: Unable to parse the string as an integer."+exp);

        };

        //4) A scenario where ArrayIndexOutOfBoundsException occurs

        int [] arr=new int[5];

        try{
            arr[2]=2;
            System.out.println(arr[2]);
            arr[6]=10;
            System.out.println(arr.length);


            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index is out of bounds."+e);
        }



        int i=50;
        int j=0;
        int data;

        try{
            data=i/j; //may throw exception
        }
        //  // handling the exception
        catch (Exception e){
            System.out.println(""+e);
            System.out.println(i/(j+2));
        }

        PrintWriter pw;
        try{
            pw=new PrintWriter("abc.txt");
            pw.println("saved");
        }
        catch(FileNotFoundException e){
            System.out.println(""+e);

        }
        System.out.println("File saved successfully");


        //Multiple catch block

        try{
            int a[]=new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");




    }
}
