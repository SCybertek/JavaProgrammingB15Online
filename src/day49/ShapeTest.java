package day49;

public class ShapeTest {

    public static void main(String[] args) {
        
        Circle c1 = new Circle(2);
        c1.calculateArea();
        c1.draw();
        System.out.println("c1 = " + c1);
        
        Square s1 = new Square(12) ;
        s1.calculateArea();
       // s1.draw();
        System.out.println("s1 = " + s1);
    }
}
