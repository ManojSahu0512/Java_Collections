package CoreJava.ClassAndObjects;

public class StudentDetails {
    public static void main(String[] args) {
        ClassExample student1=new ClassExample("Manoj Sahu",101,"Kanpur");
        student1.setName("Ajay");
        System.out.println("Student Name:"+student1.getName()+" Roll Number is:"+student1.getRollNo()+" Address is: "+student1.getAddress());

        //Student Name:Ajay Roll Number is:101 Address is: Kanpur

        ClassExample student2=new ClassExample("Amit",102,"Delhi");

        student2.insertValues("Ajay",102,"Delhi");
        System.out.println("Student Name:"+student2.getName()+" Roll Number is:"+student2.getRollNo()+" Address is: "+student2.getAddress());

        //Student Name:Ajay Roll Number is:102 Address is: Delhi

        student2.DisplayStudentDetails();
        //Student Name:Ajay Roll Number is:102 Address is: Delhi

        new ClassExample("zindal",103,"Amritsar").DisplayStudentDetails();
        //Student Name:zindal Roll Number is:103 Address is: Amritsar


    }
}
