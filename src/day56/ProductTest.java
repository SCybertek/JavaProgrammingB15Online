package day56;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product("Macbook", 2999);
        System.out.println(p1);
        Product p2 = new Product("Sony TV", 499);
        Product p3 = new Product("Sony TV", 499);
       // Product p4 = p3;


        System.out.println(p1==p2); //false
        System.out.println(p2==p3); //false
       // System.out.println(p4==p3); //true

        System.out.println(p2.equals(p3)); // where this equals method is coming from ?
        //from Object Class!! it is extending from a BIG DADDY CLAss just like toString

        //equals() method was comparing if we have different object or not
//we wrote our equals() method by comparing name and price of different two objects
        //when the name and price is same it returns true
        //it does not mean that we have same object!!!!!!

        System.out.println("p1==p2 : " + (p1==p2)   );
//        System.out.println("p2==p3 : " + (p2==p3)   ) ;
        // == will only check for whether they are pointing to same object
        // as long as they are not pointing to same object
        // it will be forever false.
        System.out.println("p1==p2 : " + (p1 == p2));
        System.out.println("p2==p3 : " + (p2 == p3));
        // equals methods is coming from Object class
        // Product extends Object so Product has equals method
        // inherited
        // inherited , We are going to Override it
        System.out.println("p1.equals(p2) = " + p1.equals(p2));
        System.out.println("p2.equals(p3) = " + p2.equals(p3));
        // below is true at all times , no matter we override or not
        System.out.println("p2.equals(p2) = " + p2.equals(p2));

        Product p4 = p3; //p4 is copying the address inside p3
        // and it's pointing to same object
        // it will be true at all situations
        System.out.println("p4.equals(p3) = " + p4.equals(p3));


        // String has overridden the equals method inherited from Object class
        // to check only for same characters or not.
        // We did exactly same thing for Product to
        // check whether they have same name and price
        System.out.println("ABC".equals(new String("ABC")));

    }
}
