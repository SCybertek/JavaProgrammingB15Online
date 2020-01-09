package day31;

public class Task1CallingOurOwnMethod {
    public static void main(String[] args) {

        sayHelloWorld7Times();
        // alternatively:

        Task1CallingOurOwnMethod.AboutMe();
        //you can call static method of other class using classname.methodname(..)
        MethodIntro.sayHello(); // we called different method from different Class!!! important

        calculateMathProblem();


    }

    private static void AboutMe() {
        //here goes a piece of code i want to reuse

        System.out.println("My name is Sofiya");

        //main method is starting point of the program

        //
        String name = "Sofiya";
        int myBirthYear = 1989;
        int myFamilyMembers = 4;

        System.out.println("My name is" + name);
        System.out.println("I was born in " + myBirthYear + "I have " + myFamilyMembers + "people in my family");
    }

    public static void sayHelloWorld7Times () {

        System.out.println("Hello World line 1");
        System.out.println("Hello World line 2");
        System.out.print("Hello world line 3");
        System.out.print("Hello world line 4");
        System.out.println("Hello world line 5");
        System.out.println("Hello World line 6");
        System.out.println("Hello World line 7");

    }

    public static void calculateMathProblem() {
        byte letterCount = 26;
        short sheepCount = 300;
        int catCount = 20;
        long mileToSun = 1000000L;
        System.out.println("The mile to Sun is" + mileToSun );
        long mileToMoon = 5000000l;
        System.out.print("The distance to the Moon is " + mileToMoon);
        //------------------floating point----
        //you must add f at the end of number to indicate this is float data typ/upper or lowercase does not matter. But it has to be there
        float priceOfBanana = 1.99f;
        System.out.println("The price of banana is "+ priceOfBanana);
        float priceOfPotato = 2.49F;
//----- large floating point numbers---
        double priceOfIpad1 = 355.99d ;
        double priceOfIpadPro = 1024.99D ;
        //complier automatically assume its a double so its not required to have d
        // however for good programming habbit, add them always
        double priceOfMac     = 2299.99;

    }
}
