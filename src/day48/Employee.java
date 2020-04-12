package day48;

public abstract class Employee {

    //instance field of abstract class:
    // abstract class has everything of normal class, except you cannot create object our of it

    String name ;
    int id ;

    // we are going to add a constructor to this abstract class to set all the field at once!

    public Employee (String name , int id) {
        //constructors cannot be abstract : because abstract classes cannot create an object
        this.name = name ;
        this.id = id ;

    }


    public abstract void calculateAnnualSalary () ; // should I input the parameters ??

    public abstract String toString () ;

}
