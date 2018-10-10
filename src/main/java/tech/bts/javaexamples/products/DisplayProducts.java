package tech.bts.javaexamples.products;

import tech.bts.javaexamples.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayProducts {

    public static void main(String[] args) {

        Product product1 = new Product("Iphone", 200, true);
        Product product2 = new Product("TV", 100, true);
        Product product3 = new Product("Movie", 50, false);

        List<Product> products = new ArrayList<Product>();

        products.add(product1);
        products.add(product2);
        products.add(product3);


        int columnWidth = 10;

        List<String> fieldNames = Arrays.asList("Name", "Price", "Available");

        String title = "";
        for (String fieldName : fieldNames) {
            title += StringUtil.padRight(fieldName, columnWidth);
        }

        String line = StringUtil.repeat("-" , columnWidth * fieldNames.size());



        System.out.println(title);
        System.out.println(line);


        for (Product product : products) {

            String productLine = StringUtil.padRight(product.getName(), columnWidth)
                    + StringUtil.padRight("" + product.getPrice(), columnWidth)
                    + StringUtil.padRight("" + product.isAvailable(), columnWidth);

            System.out.println(productLine);

        }
    }


}
