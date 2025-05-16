package CoreJava.Java8Features.OptionalClass;

import java.util.Optional;

class Address {
    String city;
    public Address(String city) { this.city = city; }
    public String getCity() { return city; }
}

class User {
    Address address;
    public User(Address address) { this.address = address; }
    public Address getAddress() { return address; }
}
public class AvoidingNullchecksInMethodcalls {
    public static void main(String[] args) {
        User user = new User(new Address("Mumbai"));

        String city = Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getCity)
                .orElse("Unknown");
        System.out.println(city); // Mumbai
    }
}
