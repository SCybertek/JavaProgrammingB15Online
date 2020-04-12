package day47;

public class Rectangle extends Shape{


//    String name ;
//    int area ;

    int width ;
    int height ;

    public Rectangle (int width , int height) {
        //I want to set the name to word rectangle ;
        super("rectangle");
        this.width = width ;
        this.height = height ;
    }

    @Override
    public void calculateArea () {
         area = height * width ;
       // System.out.println("area of rectangle = " + area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height + ",area=" + area +" name of shape is " + name +
                '}';
    }
}
