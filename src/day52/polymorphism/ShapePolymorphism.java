package day52.polymorphism;

public class ShapePolymorphism {

    public static void main(String[] args) {

        // We are doing up-casting when we apply polymorphism.
        //for instance: when we write Shape s1 = new Circle (...)--> we are up-casting because Shape is a wider data type
        //than Circle, or when we write Object s1 = new Circle(...) --> we are up-casting because Object is more general
        //than Circle. ( just remember how we were able to store int type into double--similar logic)
//Circle s2 = new Shape("shape");// ?????????? check out how this work or not work??

//        Circle  s1 = new Circle("penny",5);
////        Shape  s1 = new Circle("penny",5);
        Object s1 = new Circle("penny", 5);
//        Drawable s1 = new Circle("penny",5);

        // ONLY THE REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS WITH THAT VARIABE
//        s1.draw();
//        s1.draw();

       System.out.println(s1.toString());
//
//        // How do I know what is the actual object type

        System.out.println(s1.getClass().getSimpleName());
        //this comes from Object class: this is needed when we refer an objcet by it bigger
        //reference type
        //this method will show the name of the Object // getSimpleName will return String


    }
}
