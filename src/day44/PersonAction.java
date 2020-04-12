package day44;

public class PersonAction {

    public static void main(String[] args) {



                // teacge belongs to the class :)
        // teacher is static field
        // student is instance field

       // static: as a method name or field type -> always belongs to the class,

        Person p1 = new Person("Jon Snow", 27);
        p1.species = "Human";
        System.out.println("p1 = " + p1);

        Person p2 = new Person("Arya Stark", 18);
        p2.species = "Humanoid";
        System.out.println("p2 = " + p2);

        Person p3 = new Person("Dani", 25);
        System.out.println("p3 = " + p3);

        // what is the correct way to access static member of the class : STATIC WAY !!!
        System.out.println("Person.species = " + Person.species);

    }
}
