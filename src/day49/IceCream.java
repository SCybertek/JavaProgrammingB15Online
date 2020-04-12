package day49;

public class IceCream extends Object implements Edible {

    //CAN A CLASS both extend another class
    // and implement interface? YES!!!
    //since there is a Class called Objcet = super daddy
    // we can create Object varName = new Object () ;


    @Override
    public void eat() {
        System.out.println("eat with spoon!!");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it has melted in the cup");
    }

    @Override
    public void digest () {
        System.out.println("Default method being overridden");
    }

    public static void main(String[] args) {
       IceCream i1 = new IceCream();
       i1.eat();
       i1.drink();
        System.out.println(i1.toString());
        // you can do it
        //Object o1 = new Object();
        i1.digest();
        //default method of interface is called like instance method
        // or you CAN OVERRIDE


    }
}
