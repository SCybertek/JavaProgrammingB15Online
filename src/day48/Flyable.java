package day48;

public interface Flyable {

    ////if interviewer asks how do I define CONSTANT in java ?
    //    // you say I will create public static final field :)


    //interface can only have PUBLIC STATIC FINAL field
    // NO INSTANCE FIELD!!!

    public static final boolean HAVE_WING = true ;

    public abstract void fly () ; // no body since it is abstract - this is instance method!


    //can we have constructor in INTERFACE ?
    //ABSOLUTELY NO!!!!!


    //INTERFACE : we do not inherit a field .. only public static final
    // INTERFACE is mostly action related




}
