package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {

    public static void main(String[] args) {
        //OnLY REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS AT COMPILE TIME!
        //ACTUAL object decide what method will be called at run time

        //if we have FRUIT as refernec type, getDigested method will point to the one under Fruit class
        //Actual object type decide what method will be called at run time
        // since actual object is Apple|Orange , at run time it will call overriden version of the method
        // and that's the power of polymorphism , making the correct decision at runtime according to the actual object


        // Object takes the action= calling method == this is power of polymorphism
        //summary :
        //because reference type determines access at compile time;
        //object type determines methods at runtime
        //Late BINDING : means a method is run depending on Object ,the decision is made later when you run program

        Apple a1 = new Apple("sweet", "red","Fuji");
        //here no polymorphism 
        
        //what can I access using reference var a1 ?
        // a1 has Apple as reference type , so we can access anything inside appl e

        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
      //  System.out.println("a1.type = " + a1.type);
        
        a1.getDigested();



        System.out.println("=================");
        Fruit f1 = a1 ; //new Apple("sweet", "red","Fuji");
        //now here we refere to a a1 as a biggger refernce type! upcasting so tospeak.. POLYMORPHISM 
        // we refering with bigger reference type 
        //the catch is : there is onloy color and taste instance var.
        // we cannot access the directly Apples methods 
        // since reference type is generic and it has generic properties
        // NO ACCESS to specific 
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);

        //f1.type // we cannot access type coming from apple if we refer it as Fruit


        //if fruit does not have get digested method
        // below ill not compile
        //ONLY REFERENCE TYPE DECIDED WHAT YOU CAN ACCESS WITH VARIABLE
        f1.getDigested();
        //new Apple ("sweet", "red", "Fuji").getDigested() ;
        // we commented out the line getDigested in Fruit class
        // and now we have problem here
        //reference type is Fruit.. and we cannot access Apple getDigested method right now. since reference type is FRUIT.

        f1 = new Orange("sour-sweet", "redish", 11);
        f1.getDigested(); // f1 is being reassigned !!
        System.out.println("f1.toString() = " + f1.toString());

        String str = null ;
      //  System.out.println(str.charAt(0) ); // this will compile but will not RUN!!
        //we are trying to let the DOG that does not exist to BARK! There is no object

        //System.out.println(str.getDigested ()); // it will not compile!
        // because our reference type is String it does not get digested.. it does not bark!
        // it is not how it was defined in String Class!!








        //what decides what is visible ?
        // Reference type
        // here we have 5 reference type and 4 objects created
        //we can see how many objects by counting "new" keywords
        // Fruit is reference type , Apple is actual object Type
        Fruit f2 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("very sweet", "Blood Red", 10);


        System.out.println("===eat method call ====");
        f2.eat();
        f3.eat();
        Apple a3 = new Apple("sour", "orange", "MacIntosh");
        a3.eat();

        System.out.println("============ARRAY IN FOR EACH LOOP=======");

        //what is th ebest way to store Object?
        // Array or List

        Fruit [] all = {f1,f2,f3,f4} ;
        //lets digest all of them :
        for ( Fruit each : all ) {
            each.getDigested();
           // each.getClass().getSimpleName(); ???
        }

        System.out.println(" ====This is with LIst for loop ==== ");
        //List
        List<Fruit> allFruits = Arrays.asList(f1,f2,f3,f4) ;
//        //in this way this is NOT RESIZABLE ! cannot add or remove
//        //everything else should work.as long as size is the same
//        // how to make it modifiable ? :
//
       List<Fruit> fruitList2 = new ArrayList<>(Arrays.asList(f1,f2,f3,f4) ); // THIS IS A LIST THAT CAN BE MODIFIED
//      //  List<Fruit> fruitListNEW = new ArrayList<> (new Orange("sweet","red",23));
//
//        for (int i = 0; i < allFruits.size() ; i++) {
//          //  allFruits.get(i).getDigested();
//            System.out.println("each to string " + allFruits.get(i).toString());
//            System.out.println("class type " + allFruits.get(i).getClass().getSimpleName());
//        }

//Akbars? mine workds too

        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1, f2, f3, f4));

        for (Fruit each : fruitList) {

            System.out.println("each.toString() = " + each.toString());
            System.out.println("Class Type : " + each.getClass().getSimpleName());

        }

//
    }
}
