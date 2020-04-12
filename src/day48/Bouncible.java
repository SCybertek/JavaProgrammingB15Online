package day48;

public interface Bouncible {

    /**
     * create an interface called Bouncible
     * 		it has one constant called
     * 			gravity as double 	and assign 9.81
     * 		it has 1 abstract methods :
     * 			abstract void method bounce();
     * create 2 implementing classes of Bouncible
     * 	Ball
     * 	instance fields
     * 		shape as String
     * 		color as String
     * 	create constructor to set those 2 fields
     * 	instance methods
     * 		implements abstract method from interface
     * 		toString method
     * 	Kangaroo
     * 	instance fields :
     * 		 name as String
     * 		 int jumpDistance
     * 	add constructor to set above two fields
     * 	instance methods :
     * 		implements abstract method from interface
     * 		toString
     * 		eat()
     */

    public static final double GRAVITY = 9.81 ;

    public abstract void bounce () ;

}
