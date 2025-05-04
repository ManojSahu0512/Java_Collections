package Java8Features.StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;

class Order {
    String status;
    int price;

    Order(String status, int price) {
        this.status = status;
        this.price = price;
    }

    public String toString() {
        return status + ": " + price;
    }
}

public class FilterOrdersByStatus {
    public static void main(String[] args) {
        List<Order> orderList = Arrays.asList(new Order("DELIVERED", 500),
                new Order("CANCELLED", 200),
                new Order("DELIVERED", 700));
        List<Order>delivered=orderList.stream().filter(o->o.status.equals("DELIVERED")).toList();
        System.out.println(delivered);//[DELIVERED: 500, DELIVERED: 700]

    }
}
