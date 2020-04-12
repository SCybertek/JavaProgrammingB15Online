package day49;

public class Square extends Shape{

    // this is concrete class
    int length ;

    // this is from Shape abstract class that we extend to :
    // String name ;
    //    double area ;
    //we inherited above instance field



    //we need to override the below method:
    //    public abstract void calculateArea () ;

    @Override
    public void calculateArea() {
        area = length*length;
       // System.out.println("area of this square is = " + area);
    }

    //public abstract void draw (); we inherited it from interface . need to override
//    @Override
//    public void draw () {
//        System.out.println("I can draw this " + name + ", length of one side is  " +
//                length + " with color " + COLOR);
        // we can also call static way :
        //System.out.println(Square.COLOR);
   // }

    //setting initial values with constructor :
    public Square ( int length) {
        super("Square");
        //super(name);//reusing functionality of super class
        this.length = length;
    }
    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
//    @Override
//    public String test () {
//        return new String ("test");
//    }
}
