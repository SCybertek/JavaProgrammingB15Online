package day49;

public abstract class Shape {//implements Drawable{
    //abstract class meant to be extendable..

    //since shape is abstract and we implement interface
    // there is no NEED TO implements methods of interface in here!!


    // abstract class is not required to implement
// inherited abstract methods of the interface
    String name ;
    double area ;
    public abstract void calculateArea () ;

    // why abstract class have constructor even we can not use it to create an object ?
    // it exists purely to let sub class to call and reuse the functionality in sub class constructor
    public Shape(String name) {
        this.name = name;
    }

  private static String test () {
        return new String("this is the test of private method in abstract class");
  }

    public static void main(String[] args) {

        System.out.println(test());

        Shape blabla = new Circle(3.7);
        //implicit ?

        //explicit casting :

        Object o = new Circle(4.9); //omplicit
        Circle c1 = (Circle) o; //explicit




        }

}
