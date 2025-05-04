package Java8Features.FunctionalInterfaces.Consumer;

import java.util.Arrays;

public class StreamConsumer {
    public static void main(String[] args) {
        Arrays.asList(1,2,3).forEach(s-> System.out.println("Square of Numbers - "+s+":"+s*s));
    }
}
/*Square of Numbers - 1:1
Square of Numbers - 2:4
Square of Numbers - 3:9

* */