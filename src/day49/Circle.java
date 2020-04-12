package day49;

public class Circle extends Shape {

     double radius ;

     //from abstract shape :
    //String name ;
    //    double area ;
    //    public abstract void calculateArea () ;


    public Circle(double radius) { // since I am calling supers constructor and assigning
        // it right here. I am not going to include the parameter String name in here
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("area = " + area);
    }

    //this comes from Drawable interface :
    // public abstract void draw ();
    // need to override
    //@Override
    public void draw() {
        System.out.println("I am drawing a " + name + " that has radius of " + radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
