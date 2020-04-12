package day48;

public class Ball implements Bouncible {

    String shape ;
    String color;

    public Ball (String shape, String color) {
        this.shape = shape ;
        this.color = color ;
    }

    @Override
    public void bounce() {
        System.out.println("This " + shape + " and " + color + " ball is bouncing if gravity is " + GRAVITY);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //Ball
    //     * 	instance fields
    //     * 		shape as String
    //     * 		color as String
    //     * 	create constructor to set those 2 fields
    //     * 	instance methods
    //     * 		implements abstract method from interface
    //     * 		toString method


}
