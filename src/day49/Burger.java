package day49;


// this is a super sub relatinship: inherited relatiship / IS-A relatinonship

public class Burger implements Edible, Juicy{

// public abstract void eat () ;
//
//    public abstract void drink () ;

    //public static final boolean IS_HUMAN_FOOD = true ;

    public Burger () {
        super();
    }

    @Override
    public void eat() {
        System.out.println("eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger then drink Soda");
    }

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting");
    }


}
