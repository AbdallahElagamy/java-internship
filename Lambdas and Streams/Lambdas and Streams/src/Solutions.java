import data.Data;
import models.Product;

import java.util.List;

public class Solutions {
    public static void main(String[] args) {
        List<Product> products = Data.addDummyData();

        //Exercise_1
        System.out.println("Exercise_1");
        belongsToBooks(products);

        System.out.println();

        //Exercise_2
        System.out.println("Exercise_2");
        belongsToBooksWithPrice(products);

        System.out.println();

        //Exercise_3
        System.out.println("Exercise_3");
        belongsToToysWithDiscount(products);

        System.out.println();

        //Exercise_4
        System.out.println("Exercise_4");
        cheapestInBooks(products);
    }

    private static void cheapestInBooks(List<Product> products) {
        double minPrice = products.stream()
                .filter((p) -> p.getCategory().equals("Books"))
                .mapToDouble(Product::getPrice).min()
                .getAsDouble();
        List<Product> result = products.stream()
                .filter((p) -> p.getCategory().equals("Books") && p.getPrice() == minPrice)
                .toList();
        result.forEach(System.out::println);
    }

    private static void belongsToToysWithDiscount(List<Product> products) {
        List<Product> result = products.stream()
                .filter((p) -> p.getCategory().equals("Toys"))
                .toList();
        result.forEach((p) -> p.setPrice(p.getPrice() - .10 * p.getPrice()));
        result.forEach(System.out::println);
    }

    private static void belongsToBooksWithPrice(List<Product> products) {
        List<Product> booksCat = products.stream()
                .filter((p) -> p.getCategory().equals("Books") && p.getPrice() > 100)
                .toList();
        booksCat.forEach(System.out::println);
    }

    public static void belongsToBooks(List<Product> products) {
        List<Product> booksCat = products.stream()
                .filter((p) -> p.getCategory().equals("Books"))
                .toList();
        booksCat.forEach(System.out::println);
    }


}