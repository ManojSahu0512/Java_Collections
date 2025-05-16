package CoreJava.JavaConversion;

public class IntTo {
    public static void main(String[] args) {


      //1. int to CoreJava.String
        //CoreJava.String.valueOf(int):
        //Integer.toString(int)
        //Using CoreJava.String Concatenation


        //Using CoreJava.String.valueOf(int):
        int num=42;
        String str=String.valueOf(num);
        System.out.println("CoreJava.String is: "+str);   //CoreJava.String is: 42

        //Using Integer.toString(int):

        str=Integer.toString(num);
        System.out.println("CoreJava.String is: "+str); //CoreJava.String is: 42

        //Using CoreJava.String Concatenation:

        str=num+"";
        System.out.println("CoreJava.String is:"+str); //CoreJava.String is:42


        //***********************************************************

        //2. int to double
        // Implicit Casting:

        int num2=45;
        double d=num2; //// Automatic widening
        System.out.println("double num: "+d); //double num: 45.0

        //3. int to float
        //Implicit Casting:
        int num3 = 42;
        float f = num3; // Automatic widening
        System.out.println("Float: " + f);  //Float: 42.0

        //4. int to long
        //Implicit Casting:

        int num4 = 432;
        long l = num4; // Automatic widening
        System.out.println("Long: " + l); //Long: 432

        //*************************************************************//

        //5. int to byte
       // Explicit Casting
        int num6=10;
        byte b=(byte)num6; //// Possible data loss for large values
        System.out.println("byte data is:"+b); //byte data is:10


        //6. int to short
        //Explicit Casting

        short s=(short) num6;
        System.out.println("short data is:"+s); //short data is:10


        //7. int to char
        //Explicit Casting:
        int num9 = 65;
        char c = (char) num9; // Converts to the corresponding ASCII character
        System.out.println("Char: " + c); // Output: 'A'


        //8. int to boolean
        //Java does not allow direct conversion of an int to a boolean. However, you can write logic for a custom conversion:

        int num10 = 1;
        boolean flag = (num10 != 0); // Treat 0 as false and non-zero as true
        System.out.println("Boolean: " + flag);

        //***************************************************************************************************//

        //9. int to Integer (Wrapper ShrayansJain.Class)
        //Auto-boxing:

        int n=55;
        Integer obj=n; // Auto-boxing
        System.out.println("Integer Object:"+obj); //Integer Object:55

        //Using Integer.valueOf(int):

        Integer obj2 = Integer.valueOf(n);

        System.out.println("2nd method: "+obj2); //2nd method: 55

        //**********************************************************************//

        //10. int to Binary, Octal, and Hexadecimal (CoreJava.String Representations)

        //Binary:
        int n2=77;
        String binary=Integer.toBinaryString(n2);
        System.out.println("Binary is: "+binary); //Binary is: 1001101

        //Octal:
        String octal = Integer.toOctalString(n2);
        System.out.println("Octal: " + octal);  //Octal: 115

        //Hexadecimal:
        String hex = Integer.toHexString(n2);
        System.out.println("Hexadecimal: " + hex); //Hexadecimal: 4d


























    }
}
