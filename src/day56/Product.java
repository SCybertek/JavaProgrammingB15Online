package day56;

public class Product extends Object {// implements Comparable<Product>{

    private String name ;
    private int price ;

//    public Product (String name) {
//        this.name = name ;
//    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
// * override the .equals method coming from Object class :
// * Two products should be equal if they have the same fields value.
    @Override
    public boolean equals (Object obj) {

        //return (this == obj); this is from Object class
        //now to override: we have to refer to object as a Product.. we have to DOWNCAST!

        // down-casting from type Object to Product
        // because in order to access Product only field
        // we need to refer the object as Product


        Product otherProduct = (Product ) obj ;
        //why we need otherProduct in here?since we already have OBJ and NAME variables. can we compare these 2?
        //WE NEED otherProduct in here because we cannot check equality of obj(Object) variable and name (Product) variable
        // because they have different Reference type! and Object reference type cannot access INSTANCE field of Product
        // we need to Downcast Object obj ==into Product and we save it under otherProduct variable name
        //now we can check for equality of these two
        //now we have access to instance variable of the product

       //return this.name.equals(otherProduct.name) && this.price==otherProduct.price ;

        return this.name.equals(otherProduct.name)
                && this.price == otherProduct.price;

    }

//    @Override -- revisittedn comparabel method.. we have Product as a refernec type no need to create other product in here
//    public int compareTo(Product o) {
//        return 0;
//    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    /**
     * Create a class called Product with encapsulated fields name, price and constructor
     * override the .equals method coming from Object class :
     * Two products should be equal if they have the same fields value.
     * Practice Association: important
     * create a class called Store
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
