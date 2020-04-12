package day49;


// this is my interface
// interface is like a Contract , once someone sign a contract he / she will provide all the details
// what he or she must do

///INTERFACE IS NOT A CLASS!!!!!!

public interface Edible {

    //in interface any fields are automatically public static final , if not defined so
    //public static final field naming convention is ALL_CAPS
    // you can have as many constants ( PUBLIC STATIC FINAL..) as you want


// if a method with no body is not defined public abstract it is a automatically
    public static final boolean IS_HUMAN_FOOD = true ;

    public abstract void eat () ;

    public abstract void drink () ;

    //default method
    //it exists only in INterface
    //it has to have a body!
    // an EMPTY body is still a BODY!!!

    //default keyword here is not an access modifier !!!
    //implicity the method is public if you do not specify so !
    //
      public default void digest () {
        //we are adding a DEFAULT METHOD! and add the body
        System.out.println("YOU IMPLEMENT THE CODE YOURSELF!");
    }

   // adding a NEW METHOD in interface will affect everything!! it is a big thing!

    // as long as you dont see anything in access modifier then it is a default





}
