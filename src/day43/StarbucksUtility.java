package day43;

public class StarbucksUtility {

    public static void main(String[] args) {

        Coffee c = new Coffee("Blonde", 5, 1.6);

    printCoffeeInfo(c); // here what is it expecting??? it is n ot int or String
        // parameter is Coffee object ..

        String myString = new String("hello");
       // StarbucksUtility util = new StarbucksUtility();
       // util.printStringInfo(myString);// bad idea to call STATIC with OBJECT!!!
        printStringInfo(myString);


        Coffee c1 = new Coffee();
        printCoffeeInfo(c1);

        // you can either store Coffee object into a variable like above
        // of your can directly pass a coffee object without storing it
        printCoffeeInfo(new Coffee("Intensito", 10));


//        // we would need an object of current class if we wanted call
//        // instance method of current class
    }

    // idea is :
    // Create a static method to accept a coffee object and print its info
    // like this: this coffee is : name , price is <price> , caffeine level is < level>

    public static void printCoffeeInfo (Coffee co) {

        System.out.println("This coffee is : " + co.getType());
        System.out.println("Price is : " + co.getPrice());
        System.out.println("Caffeine Level is : " + co.getCaffeineLevel());

    }

    /**
     * a static method to print out first and last character of a String
     * @param str
     */
public static void printStringInfo (String str) { // we removed static in here and above
    //printStringInfo(myString); gave a RED.. what should we do?
    // it become instance : we create an object .. and use it to call

    System.out.println("first character is : " + str.charAt(0));
    System.out.println("last character is : "+ str.charAt(str.length()-1));
}
}
