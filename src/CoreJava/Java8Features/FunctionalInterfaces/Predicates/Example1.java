package CoreJava.Java8Features.FunctionalInterfaces.Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven=x->x%2==0;
        List<Integer> numbers=Arrays.asList(1,23,33,40);
        for(Integer num:numbers){
         if(isEven.test(num)){
             System.out.println(num);
         }
        }

        Predicate<String> startsWithLetterV=x->x.toLowerCase().charAt(0)=='v';
        System.out.println(startsWithLetterV.test("Hello"));
        Predicate<String> endWithLatterL=x->x.toLowerCase().charAt(x.length()-1)=='l';
        System.out.println(endWithLatterL.test("vipul"));

        Predicate<String> and=startsWithLetterV.and(endWithLatterL);
        System.out.println(and.test("vipul"));//true
        System.out.println(startsWithLetterV.negate().test("vipul"));//false because of negate

        Student s1=new Student("vipul",1);
        Student s2=new Student("Ram",2);

        Predicate<Student> studentPredicate=x->x.id>1;
        System.out.println(studentPredicate.test(s2));//true

        Predicate<Object> predicate=Predicate.isEqual("Vipul");
        System.out.println(predicate.test("Vipul"));//true

    }
    private static class Student{
        Integer id;
        String name;

        public Student(String name,Integer id) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
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
