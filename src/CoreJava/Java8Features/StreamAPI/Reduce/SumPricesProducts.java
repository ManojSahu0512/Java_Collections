package CoreJava.Java8Features.StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;

class Product {
    int price;
    Product(int price) {
        this.price = price;
    }
}
public class SumPricesProducts {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(100),
                new Product(200),
                new Product(300)
        );
        int total=products.stream().map(p->p.price).reduce(0,Integer::sum);
        System.out.println(total);//600
    }
}
