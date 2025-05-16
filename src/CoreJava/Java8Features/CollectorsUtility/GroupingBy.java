package CoreJava.Java8Features.CollectorsUtility;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    String city;
    Person(String name, String city) {
        this.name = name; this.city = city;
    }
    public String getCity() { return city; }
    public String getName() { return name; }
}
public class GroupingBy {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", "Pune"),
                new Person("Bob", "Mumbai"),
                new Person("Charlie", "Pune")
        );

        Map<String, List<Person>> groupedByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));

        System.out.println(groupedByCity);
    }
}
