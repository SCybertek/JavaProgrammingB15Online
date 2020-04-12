package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {

    public static void main(String[] args) {

        List<Product> denisList = Arrays.asList(new Product("cookie",3),
                new Product("tea",3),
                new Product("coffee",7),
                new Product("muffin",5));

        Store s2 = new Store ("Denis Store",denisList);
        System.out.println("s2 = " + s2);

        Product p1 = new Product("CheeseCake", 10);
        s2.addProduct(p1);
       // System.out.println("s2 = " + s2);
        s2.addProduct("Latte",3); //new project without pointer
       // System.out.println("s2 = " + s2);
        System.out.println(s2.getProductCount() );
        s2.displayProduct();
        System.out.println("s2.checkIfProductExists(\"CheeseCake\",10) = " +
                s2.checkIfProductExists(new Product("CheeseCake", 10)));

        System.out.println("where is cheesecake = " + s2.indexOfProduct(p1));
        s2.removeProduct(p1);

    }
}
