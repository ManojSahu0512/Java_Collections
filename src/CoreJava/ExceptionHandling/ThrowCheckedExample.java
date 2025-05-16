package CoreJava.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowCheckedExample {
    public static void MethodExample() throws FileNotFoundException{
        FileReader file=new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
        BufferedReader inputFile=new BufferedReader(file);

        throw new FileNotFoundException();

    }
    public static void main(String[] args) {
        try{
            MethodExample();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        }

    }
}

