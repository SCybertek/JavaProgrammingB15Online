package day11;

public class StringEquality {
    public static void main(String[] args) {

        // class type or reference type or class type (also non-primitives) starts with bigletter ! capital letter .
        //examples : Scanner, String
        //all primitive types start with lower case
        //class defines a property and behaviors of object
        //object has state (attribute, characteristics) and behaviour (method, action, running sleeping )

        String name = "Rabia"; // string literal

        String name2 = new String ("Rabia");
        String name3 = "Rabia";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("Using == METHODS");

        System.out.println(name == name2);
        System.out.println(name == name3);
        //TO COMPARE STRINGS NEVER EVER USE == !!!!

        //WHAT is the correct way to see string equality ?
        // the correct way of comparing String to get sonsistent result is using
        // one of the String pbject behavior / method called
        //equals method
        // str1.equals (str2)
        System.out.println("Using EQUALS methods");
        System.out.println(name.equals(name2)); // name. after comes ACTION you want to take
        //in this case it is comparing name to name 2
        System.out.println(name.equals(name3));

        //Tomorrow we will learn WHY regular equality does not work



    }

}
