package OOPs.Polymorphism;

//Java instanceof
//The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
class Animals{

}

public class InstanceOfExample extends Animals {
    public static void main(String[] args) {
        InstanceOfExample instanceOfExample=new InstanceOfExample();
        Animals inst=new InstanceOfExample();

        System.out.println(instanceOfExample instanceof InstanceOfExample);//true
        System.out.println(inst instanceof Animals); //ture


    }
}
