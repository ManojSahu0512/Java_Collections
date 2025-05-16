package ShrayansJain.Reflection.ReflectionOfClass;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. using forName("") method
        Class birdClass=Class.forName("ShrayansJain.Reflection.Bird");
        System.out.println(birdClass);
        //2 using .class
        Class birdClass2= Bird.class;
        System.out.println(birdClass2);

        //3 using getClass() method
        Bird birdObj=new Bird();
        birdObj.getClass();
        System.out.println(birdObj);
    }
}
//class ShrayansJain.Reflection.Bird
//class ShrayansJain.Reflection.Bird
//ShrayansJain.Reflection.Bird@1b28cdfa