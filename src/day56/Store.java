package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    // I added this name as new requirement so we can identify our store by name
    String name; //adding a field so we can give a name to Store object when we create one
   private List<Product> allProducts ; //store has List of products

    public Store () {
        this.name = "Cybertek Store";
        // creating ArrayList object here
        // eventually we would have to do it anyway!
        this.allProducts = new ArrayList<>();

    }
    //      2 Arg constructor to accept List<Product>
//    First line of constructor should call no arg constructor to reuse initialization logic.
    public Store(String name, List<Product> otherList) {
        this(); // was Cybertek Store but next line makes it possible to Add different store name
        this.name = name;
        allProducts.addAll(otherList);
        //we can give whatever name we want but this() will give Cybertek to all store names so to get rid of default name we provide line 19
    }

    /**
     * A method to get most expensive Product
     *
     * @return The product object with max price
     */
    public Product getMostExpensiveProduct() { // I only copied this one --REVIEW missed parts

//        int max = allProducts.get(0).getPrice();
        // assume my max price is lowest number in integer range so it will be replaced by any price
        int max = Integer.MIN_VALUE;
        int maxIndex = -1; //assuming our index is -1 before we actually find it //this will be replaced anyway

        for (int x = 0; x < allProducts.size(); x++) {

            if (allProducts.get(x).getPrice() > max) {
                max = allProducts.get(x).getPrice();
                maxIndex = x;
            }

        }
        System.out.println("max = " + max);
        return allProducts.get(maxIndex);
    }

    //display product method to show the product nicely

    /**
     * Display all product in human readable manner
     */
    public void displayProduct () {
        System.out.println(name + "'s Store has below product");
        for ( Product each : allProducts) {
            System.out.println("\t each = " + each);
        }
    }
    /**
     * Counting how many products we have in the store
     * @return the size of Product List
     */
    public int getProductCount () {
        return allProducts.size();
    }
// * Create an instance void method called addProduct(Product p)
    /**
     * This version of addProduct will directly accept ready Product object
     * so it can be added to the allProductsList
     * @param p to be added
     */
    public void addProduct (Product p) {
        //according to our logic with 2 Constructores our allProduct is never never NULL.it is always created!IMPORTANT
        allProducts.add(p) ; //we can do this since allProducts is Product list and Product class has equal method (?) defined
    }

    //for user not using new keyword we are Overloading the addProduct method () :

    /**
     * This version of addProduct will accept data that necessary to
     * create Prodyct objcet so it can be eventusally added to the list
     * @param productName
     * @param productPrice
     */
    public void addProduct (String productName, int productPrice) {
        Product newP = new Product(productName,productPrice); //newP is local temp variable in here
        allProducts.add(newP);
    }

    //* Create an instance void method called removeProduct(Product p)
    public void removeProduct (Product p) {
        if (checkIfProductExists(p) == true ) {
            allProducts.remove(p) ;
        }else {
            System.out.println("there is no " + p);
        }

    }
//   * Create an instance void method called checkIfProductExist(Product p)
    public boolean checkIfProductExists (Product p) {
        return allProducts.contains(p) ;
    }

    /**
     * Find out 0 based location of the product in the store
     * @param p prodcut objcet to be checked
     * @return return the index number
     */
    public int indexOfProduct (Product p) {
        return allProducts.indexOf(p);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }

/** create a class called Store
     * It has List<Product> as instance variable
     * no arg constructor to initilize the list to empty ArrayList object
     * 1 Arg constructor to accept List<Product>
     * First line of constructor should call nonath constructor to reuse initialization logic.
     * Inside constructor AddAll Products user passed to the instance variable last.
     * Create an instance void method called addProduct(Product p)
     * Create an instance void method called removeProduct(Product p)
     * Create an instance void method called checkIfProductExist(Product p)
     * Hint : just call list remove method, it will internally call .equal method to decide which one to remove
     * more methods : find and return max price product, Find sum.of all products
     * Find list of products more than average
     */
}
