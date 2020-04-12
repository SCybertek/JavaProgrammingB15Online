package day41;

public class ProductDemo {

    public static void main(String[] args) {
        
        Product p1 = new Product() ; 
        p1.setName("iPhone");
        p1.setPrice(699);

        System.out.println("p1.getName() = " + p1.getName());
        
        // I want to store the price

        double myPrice = p1.getPrice();

        System.out.println("myPrice = " + myPrice); // how we can print this ?? without toString?

        System.out.println(p1);// we do not have toString method thats why we cannot print this I guess ??

        //System.out.println("myPrice = " + myPrice); --. myPrice.soutv ENTER :)
    }
}
