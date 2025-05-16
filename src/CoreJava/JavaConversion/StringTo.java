package CoreJava.JavaConversion;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class StringTo {
    public static void main(String[] args) throws ParseException {

        //1. CoreJava.String to int
        //Using Integer.parseInt(CoreJava.String):

        String str="42";
        int num=Integer.parseInt(str);
        System.out.println("Int is :"+num); //Int is :42

        //Using Integer.valueOf(CoreJava.String) (returns Integer):

        int num2=Integer.valueOf(str);
        System.out.println("Int is:"+num2);

        //*****************************************************//
        //2. CoreJava.String to double
        //Using Double.parseDouble(CoreJava.String):
        String str2 = "42.5";
        double d = Double.parseDouble(str2);
        System.out.println("double: " + d); //double: 42.5

        //Using Double.valueOf(CoreJava.String) (returns Double):
        Double d2 = Double.valueOf(str);
        System.out.println("method 2: "+d2);

        //******************************************************//
        //3. CoreJava.String to float
        //Using Float.parseFloat(CoreJava.String)
        String str3 = "42.5";
        float f = Float.parseFloat(str3);
        System.out.println("float: " + f);//float: 42.5

       // Using Float.valueOf(CoreJava.String):
        Float f2 = Float.valueOf(str3);
        System.out.println(f2);


        //*************************************************//

        //4. CoreJava.String to long

        //Using Long.parseLong(CoreJava.String):

        String str4 = "123456789";
        long l = Long.parseLong(str4);
        System.out.println("long: " + l);

        //Using Long.valueOf(CoreJava.String):
        Long l2=Long.valueOf(str4);
        System.out.println(l2);

        //****************************************************************//

        //5. CoreJava.String to byte
        //Using Byte.parseByte(CoreJava.String):

        String str5 = "92";
        byte b = Byte.parseByte(str5);
        System.out.println("byte: " + b);

        //Using Byte.valueOf(CoreJava.String):
        Byte by = Byte.valueOf(str5);
        System.out.println(by);

        //*************************************************************//
        //6. CoreJava.String to short
        //Using Short.parseShort(CoreJava.String):
        //
        String str7 = "42";
        short s = Short.parseShort(str7);
        System.out.println("short: " + s); //hort: 42

        //Using Short.valueOf(CoreJava.String):

        Short sh = Short.valueOf(str);
        System.out.println(sh);

        //**************************************************************************//
        //7. CoreJava.String to char
        //A CoreJava.String can be converted to a char if it contains only one character:
        //
        //Using charAt(0)

        String str8 = "A";
        char c = str8.charAt(0);
        System.out.println("char: " + c); //char: A

        //***********************************************************************//
        //8. CoreJava.String to boolean
        //Using Boolean.parseBoolean(CoreJava.String):

        String str10 = "true";
        boolean bul = Boolean.parseBoolean(str10);
        System.out.println("boolean: " + bul); //true
        //if not exactly it will print false for any string


        //*********************************************************************//
        //9. CoreJava.String to Wrapper Classes
        //For any wrapper class (e.g., Integer, Double, etc.), use valueOf():

        String str11 = "42";
        Integer intObj = Integer.valueOf(str11);
        Double doubleObj = Double.valueOf("42.5");

        //********************************************************************//

        //10. CoreJava.String to Date
        //Using SimpleDateFormat


        String str12 = "2025-01-26";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str12);
        System.out.println("Date: " + date); //Date: Sun Jan 26 00:00:00 IST 2025

        //**************************************************************//
        //11. CoreJava.String to Array
        //Splitting a CoreJava.String into an Array

        String str13 = "a,b,c";
        String[] arr = str13.split(",");
        System.out.println("Array: " + Arrays.toString(arr)); //Array: [a, b, c]

        //******************************************************************//

        //12. CoreJava.String to BigInteger and BigDecimal
        //Using BigInteger:
        String str15 = "12345678901234567890";
        BigInteger bigInt = new BigInteger(str15);
        System.out.println("BigInteger: " + bigInt);

        //******************************************************************//

        //Using BigDecimal:
        String str16 = "12345.67890";
        BigDecimal bigDec = new BigDecimal(str16);
        System.out.println("BigDecimal: " + bigDec);













    }
}
