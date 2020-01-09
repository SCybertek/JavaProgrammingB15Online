package day34;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodOverLoadingIntro {
    public static void main(String[] args) {

// these are same nam but different parameters!!
        //like sout can accept string or int .. look for more ex below!

        System.out.println("Method overloading");
        System.out.println(12);

        String name = "overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));

        // two versions of indexOf . there are 4 versions
        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));

       //  Arrays.toString has 9 different version to accept different parameter

        // METHOD overloading :
        // the aim is for method we are calling to be able to accept dif parameters
        // so we dont come up with dofferent names depending of what it is accepting
        // in other words: using same name and different parameter for method
        //                  to reuse the name for a similar action

        // WE CANNOT HAVE 2 METHODS WITH SAME NAME AND SAME PARAMETERS!!!
        // has to be a different data type inside the parameters , not just different variable name

        //method name + parameter list = method SIGNATURE
        // same method name and different parameter list : it is needed for method overloading!


        sayHello();
        sayHello("Universe"); // Universe is the argument
        sayHello("Denis");
        sayHello(23);
        System.out.println(sayHello("Sofiya", "Orman"));
    }

    public static void sayHello () { // this is METHOD HEADER
        System.out.println("Hello, World"); // inside { THE METHOD BODY }
    }

    public static void sayHello (String name) { // (String name ) is method parameter
        System.out.println("Hello, " + name);
    }

    public static void sayHello (int num) { // sayHello (int num) : this is METHOD SIGNATURE
        System.out.println("Hello, " + num);
    }

   // public static void sayHello (int x) { this is regarded as same method like above method!!
     //   System.out.println("Hello, World");
  //  }

    public static String sayHello ( String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName ;
    }
}
