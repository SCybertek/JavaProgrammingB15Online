package day53;

public abstract class Fruit implements Edible{

    //POLYMORPHISM
    //when the object is created with reference type different than itself (from parent class or interface)
    //when object type is child class and reference data type is parent class
    //referring an object with parent type

    //behavior of the method is decided by its reference type. at the run time!
    //2 RULES:
    //1) reference type decides what is accessible and what can be used
    //2) reference type can be parent class or interface, and objects can be any sub class

    //ONLY works in IS-A Relationship!



    String taste ;
    String color ;


    public Fruit(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }

    public abstract void getDigested () ;

    @Override
    public String toString () {
        return "HELLO FROM FRUIT";
        //this will be used if we didnot have toString in Orange class

    }

    

  //  public abstract void eat () ; this comes from Edible interface
    // since this class is abstract we do not need to override it!
}
