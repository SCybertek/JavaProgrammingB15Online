package day49;

public interface Chargeable {

    public default void charge () {
        System.out.println("Default charge "  + "You may wanna do on your own");
    }
}
