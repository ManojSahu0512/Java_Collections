package CoreJava.Java8Features.FunctionalInterfaces.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String,Integer> function1=x->x.length();
        Function<String,String> function2=x->x.substring(0,3);
        List<Student> result=new ArrayList<>();
        Function<List<Student>,List<Student>> studentWithViAsPrefix=li->{

            for(Student s:li){
                if(function2.apply(s.getName()).equalsIgnoreCase("Vip")){
                    result.add(s);


                }

            }
            return result;

        };
        Student s1=new Student(2,"Vipul");
        Student s2=new Student(2,"vipulav");
        Student s3=new Student(2,"Arnav");
       List<Student> students= Arrays.asList(s1,s2,s3);
        List<Student> filteredStudent=studentWithViAsPrefix.apply(students);
        System.out.println(filteredStudent);

    }
    private static class Student{
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
