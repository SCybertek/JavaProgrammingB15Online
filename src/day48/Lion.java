package day48;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mammals{

    // now this is a very very first concrete class and
    // it is required to implement all abstract methods it inherited

    @Override
    public void drinkMilk() {
        System.out.println("LION DRINKS MILK");
    }

    @Override
    public void makeNoise() {
        System.out.println("LION SAYS ROAAAAARRRRRRRRRR!!!!");
    }


//    public abstract void makeNoise () ;
//
//    public abstract void drinkMilk () ;


    public static void main(String[] args) {

//        Lion li1 = new Lion();
//        li1.drinkMilk();
//        li1.makeNoise();




        //any class you created , it can be a data type for a variable
        // also known at Reference variable

        Animal a1 = new Lion () ;
        a1.makeNoise();
        // whatever comes after = should be a CONCRETE subclass of Animal

        //Animal b1 = new EmploymentChart(); cannot do this

        List<Integer> lst = new ArrayList<>();
        //List is a general  = ArrayList is more specific




    }
}
