package CoreJava.Java8Features.StreamAPI.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int price;

    public Product(int price) {
        this.price = price;
    }

    int getDiscountedPrice() {
        return price - 100;

    }
}

public class MapForDataTransformation {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1000),
                new Product(1500),
                new Product(2000)
        );

        List<Integer> discountedPrices = products.stream()
                .map(Product::getDiscountedPrice).collect(Collectors.toList());
        //if function need price parameter then use below code
        //List<Integer> discountedPrices2 = products.stream()
          //      .map(p -> p.getDiscountedPrice(p.price)) // fix: use lambda to call method with parameter
             //   .collect(Collectors.toList());

        System.out.println(discountedPrices); // [900, 1400, 1900]
    }
}
