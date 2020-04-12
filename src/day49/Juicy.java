package day49;

public interface Juicy {

    public abstract void melt () ;

    //another interface method can have is static method!!
    //it must have a body and it is there to provide a utility method
    //that does not belong to any class
    //STATIC METHODS of INTERFACE ARE NOT INHERITED!!

    public static void squeeze () {
        System.out.println("static squeezing");
    }
    //what is it good for ?  and it's there to provide some utility methods

    //// Interface can achieve loosely coupling between implementing classes
    //// for example : When we say flyable
    //// all the implementing classes like Plane , Insects, Superman ....
    //// can be all Flyable and has nothing to do with each other
    //// and almost no knowledge about each other : known as loosely coupling
    //// This is why it's always preferred in design
}
