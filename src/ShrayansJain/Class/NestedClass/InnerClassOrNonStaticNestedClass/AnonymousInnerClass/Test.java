package ShrayansJain.Class.NestedClass.InnerClassOrNonStaticNestedClass.AnonymousInnerClass;

public class Test {
    public static void main(String[] args) {
        Car audiCarObj=new Car(){

            @Override
            public void pressBreak() {
                //my audi specific implementation here
                System.out.println("Audi specific break changes");

            }
        };
        audiCarObj.pressBreak();
    }
}
