package OOPs.Aggregation;

class Address{
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.address = address;
        this.name = name;
        this.id = id;

    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);


    }
}

public class HasAExample {
    public static void main(String[] args) {
        Address address=new Address("Kanpur","U.P.","India");
        Employee employee=new Employee(101,"Sana",address);
        employee.display();
        System.out.println("----------------------------");

        Employee employee1=new Employee(102,"zana",new Address("zyz","dd","flf"));
        employee1.display();


    }
}

//101 Sana
//Kanpur U.P. India
//----------------------------
//102 zana
//zyz dd flf
