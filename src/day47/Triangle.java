package day47;

public class Triangle extends Shape {

    int height ;
    int base ;

    public Triangle (int height , int base) {
        super("triangle") ; //this //did not work at the beginning  so I added default constructor to abstract class
        this.height = height ;
        this.base = base ;
    }

    @Override
    public void calculateArea () {
        area = height * base / 2;
        //System.out.println("area of triangle= " + area);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
