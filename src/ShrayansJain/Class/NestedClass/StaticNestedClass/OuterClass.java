package ShrayansJain.Class.NestedClass.StaticNestedClass;

public class OuterClass {
    int instanceVariable=10;
    static int classVariable=20;
    static class NestedClass{
        public void print(){
            //here only access class variables
            System.out.println(classVariable);
        }
    }
}
