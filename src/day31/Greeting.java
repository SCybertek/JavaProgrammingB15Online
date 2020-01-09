package day31;



public class Greeting {
    public static void main(String[] args) {

        sayHello();

        sayHelloTo("Batch 15");// YOu pass this date when you call this method -
        // data is Batch 15 and method is sayHelloTo
        //this method accepts external data

        sayHelloTo("Kids");
        //sayHelloTo();-- it will give an error if no extra data provided!!!


        // end result should be:
        // sayHello("batch 15") --- print hello batch 15
        // sayHello("Kids") --> print hello Kids

// method that accepts external data!!!:
        //I want to create a method that does:
        //say Hello to persons name I passed when I call this method



    }

    public static void sayHelloTo(String name){ // you can change name - put whatever you want
        // external data this method will accept is String and it is called name
        //external data is called METHOD PARAMETER

        System.out.println("Hello "+ name);

    }

    public static void sayHello() {
        System.out.println("Hello B15");
    }
}
