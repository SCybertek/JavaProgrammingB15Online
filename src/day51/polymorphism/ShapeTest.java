package day51.polymorphism;

import day51.polymorphism.*;

import java.util.ArrayList;

import java.util.List;


public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Triangle() ;

        Shape s2 = new Rectangle() ;

        Shape s3  = new Circle() ;
        
        s1.draw();
        s2.draw();
        s3.draw();

        Shape [] manyShape = {s1,s2,s3};
        for (Shape each: manyShape) {
            //System.out.println("each shape= " + each);
            each.draw();
        }

        //hash code again !!

        //System.out.println(Arrays.toString(manyShape));
        //hash code again!! :(

        Shape s4 = new Oval();
        Shape s5 = new Rhombus();

        //Also try to create ArrayList
        //and call draw method on each of them

        System.out.println("------------------");
        List<Shape> all = new ArrayList<>();
        //              = Arrays.asList(s1,s2,s3,s4,s5) ; this will become unodifiable arrayList
        //List<Shape> shapes = new ArrayList<Shape>(Arrays.asList(s1,s2,s3,s4));
        all.add(s1);
        all.add(s2);
        all.add(s3);
        all.add(s4);
        all.add(s5);

        for (Shape eachShape : all) {
            eachShape.draw();
        }
        for (int i = 0; i < all.size(); i++) {
            all.get(i).draw();
        }
       // System.out.println("all = " + all.draw); hash code here

        //create an array of shape to store 5 concrete Shape Object
        //and call the draw the method


        System.out.println("----------------");
        Shape [] fiveShapes = {s1,s2,s3,s4,s5};
        for (Shape each: fiveShapes) {
            each.draw();
        }

        for (int i = 0; i < fiveShapes.length; i++) {
            fiveShapes[i].draw();
        }


    }
}
