package day47;

public class ShapeTest {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(25,12);
        System.out.println("r1 before calculating= " + r1);
        r1.calculateArea();
        System.out.println("r1 = " + r1);

        Triangle t1 = new Triangle(23,72);
        System.out.println("t1 before= " + t1);
        t1.calculateArea();
        System.out.println("t1 after= " + t1);
    }
}
