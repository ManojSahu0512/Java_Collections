package CoreJava.ExceptionHandling;

class Parent{
    void msg(){
        System.out.println("Parent method");
    }
}

public class TestExceptionChild extends Parent{

    void msg() {    //IOException throws is not allowed
        System.out.println("TestExceptionChild");
        Parent p = new TestExceptionChild();
        p.msg();


    }

}
