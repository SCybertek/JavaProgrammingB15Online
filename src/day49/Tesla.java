package day49;

public class Tesla extends Vehicle implements Autonomous, Chargeable {

    int horsePower ;
    String model;
    //this comes from Vehicle abstract class : inherited
    //int year ;
    //public Vehicle ( int year ) {
    //        this.year = year ;
    //
    //    }
    //
    //    public abstract void  start( ) ;
    //
    //    public void goForward () {
    //        System.out.println("going forward ");
    //    }
    // I am creating constructor : and since we extend to Vehicle thats why I call super
    public Tesla ( int year , int horsePower, String model) {
        super(year);
        this.horsePower = horsePower ;
        this.model = model;
    }

    //need to override abstract method start

    @Override
    public void start () {
        System.out.println("Tesla is starting");
    }


    //this is from Autonomous class :
    // public abstract void slfDrive() ;
    //we inherit abstract methods and need to override it

    @Override
    public void slfDrive() {
        System.out.println("Tesla model" + model + " working on self driving car");
    }


    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    //public default void charge () {
    //        System.out.println("Default charge "  + "You may wanna do on your own");
    //    }

    //we have default method from interface and WE INHERIT IT! THERE IS A BODY AND WE DO NOT NEED TO IMPLEMENT IT
    // YOU CAN OVVERIDE IT if you want

    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }
}
