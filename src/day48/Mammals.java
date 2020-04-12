package day48;

public abstract class Mammals extends Animal {

    // Mammal extend to abstract Animal suoer class
    //and yet Mammal is another abstract idea itself

   // public abstract void makeNoise () ;

    // if the subclass of abstract superclass is also abstract
    // you ar enot required to provide a body for abstract methods! *that you inherited
    //because abstract class can have abstract method
    // can I override make noise method in here ?
    //yes, you can optionally provide a body

    public abstract void drinkMilk () ;

}
