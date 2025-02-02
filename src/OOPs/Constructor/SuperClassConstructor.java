package OOPs.Constructor;


class Person{
    private String name;
    private int age;
    // Constructor for the Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {

        System.out.println("Name: " + name + ", Age: " + age);
    }


}
class Students extends Person{
    private String school;
    public Students(String name,int age,String school ){
        super(name,age); // Call the superclass (Person) constructor with name and age
        this.school=school; //Assign the school passed to the constructor to the school field

    }
    @Override
    public void displayInfo(){
        super.displayInfo();                                  /// Call the displayInfo Method of the superclass (Person)
        System.out.println("school"+this.school);
    }

}
public class SuperClassConstructor {
    public static void main(String[] args) {
        Students student=new Students("ahilya",22,"AOJS");

        student.displayInfo();

    }
}
