package ShrayansJain.Collections.Stream.WayOfCreateStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamExample {
    public static void main(String[] args) {
        //1. From collection:
        List<Integer> salaryList= Arrays.asList(3000,4200,9000,3500);
        Stream<Integer> streamFromIntegerList=salaryList.stream();


        //2. From Array:
        Integer[] salaryArray={3000,4100,9000,1000,3500};
        Stream<Integer> streamFromIntegerArray=Arrays.stream(salaryArray);

        //3. From Static Method:
        Stream<Integer> streamFromStaticMethod=Stream.of(1000,3500,4000,9000);

        //4. From String Builder:

        Stream.Builder<Integer> streamBuilder=Stream.builder();
        streamBuilder.add(1000).add(9000).add(3500);
        Stream<Integer> streamFromStreamBuilder=streamBuilder.build();

        //5. From Stream Iterate:

        Stream<Integer> streamFromIterate=Stream.iterate(1000,(Integer n)->n+5000).limit(5);


    }
}
