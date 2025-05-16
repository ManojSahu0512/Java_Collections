package CoreJava.OOPs.Inheritance;

class Animals{
    void eat(){
        System.out.println("Eating...");

    }

}
class Dogs extends Animals{
    public void barking(){
        System.out.println("Barking...");
    }
}

class DogBaby extends Dogs{
    public void weeping(){
        System.out.println("Weeping...");
    }
}

public class MultiLevelInteritance {
    public static void main(String[] args) {
        DogBaby baby=new DogBaby();
        baby.eat();
        baby.barking();
        baby.weeping();
        //Eating...
        //Barking...
        //Weeping...
    }
}
