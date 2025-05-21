package ShrayansJain.Collections.ComparatorVsComparable.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car[] carArray=new Car[3];
        carArray[0]=new Car("suv","petrol");
        carArray[1]=new Car("sedan","diesel");
        carArray[2]=new Car("hatchback","cng");

        Arrays.sort(carArray,(Car obj1,Car obj2)->obj1.name.compareTo(obj2.name));
          for(Car car:carArray){
              System.out.println(car.name+"--"+car.type);
          }

        List<Car> cars1=new ArrayList<>();
          cars1.add(new Car("suv","petrol"));
          cars1.add(new Car("sedan","diesel"));
          cars1.add(new Car("hatchback","cng"));
        Collections.sort(cars1,(Car obj1,Car obj2)->obj1.name.compareTo(obj2.name));//internally it first convert arraylist to array then do compareTo
    }
}
//hatchback--cng
//sedan--diesel
//suv--petrol