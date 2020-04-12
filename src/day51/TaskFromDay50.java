package day51;

import day49.Circle;
import day49.Drawable;
import day49.Shape;

public class TaskFromDay50 {

    public static void main(String[] args) {
        // Create a different class with main method:
// and try to use the Shape, Circle, Triangle class from day 50
// Create list of Shape and calculate their area

        // Shape from dy 49 implements Darwable interface :
        // public abstract void draw ();
        //
        //    //constant field :
        //    public static final String COLOR = "Blue";
        //
        //String name ;
        //    double area ;
        //    public abstract void calculateArea () ;
        //


        Shape s1 = new Circle(3.4) ;
       // s1.draw();
        System.out.println(Drawable.COLOR);
        s1.calculateArea();





    }
}
