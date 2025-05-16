package ShrayansJain.Class.NestedClass.InnerClassOrNonStaticNestedClass.MemberInnerClass;

public class OuterClass {
    int instanceVariable=10;
    static int classVariable=20;
    class InnerClass{
        public void print(){
            //here only access class variables
            System.out.println(classVariable+instanceVariable);
        }
    }
}
