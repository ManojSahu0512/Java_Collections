package CoreJava.ClassAndObjects;

public class ClassExample {
    private String name;
    private int rollNo;
    private String address;

    //initializing value using constructor
    public ClassExample(String name,int rollNo,String address){
        this.name=name;
        this.rollNo=rollNo;
        this.address=address;

    }
    public void setName(String name){
        this.name=name;

    }

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;

    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }

    public int getRollNo(){
        return rollNo;
    }

    public String getAddress(){
        return address;
    }


    //initialising value using method
    public void insertValues(String name,int rollNo,String address){
        this.name=name;
        this.rollNo=rollNo;
        this.address=address;


    }

    public void DisplayStudentDetails(){

        System.out.println("Student Name:"+this.name+" Roll Number is:"+this.rollNo+" Address is: "+this.address);
    }



}
