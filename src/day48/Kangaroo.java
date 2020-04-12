package day48;

public class Kangaroo implements Bouncible{

    //	Kangaroo
    //     * 	instance fields :
    //     * 		 name as String
    //     * 		 int jumpDistance
    //     * 	add constructor to set above two fields
    //     * 	instance methods :
    //     * 		implements abstract method from interface
    //     * 		toString
    //     * 		eat()

    String name ;
    int jumpDistance ;

    public Kangaroo (String name , int jumpDistance) {
        this.name = name ;
        this.jumpDistance = jumpDistance ;

    }

    public void eat () {
        System.out.println("Kangaroo with name " + name + " is eating");
    }

    @Override
    public void bounce() {
        System.out.println("This " + name + " can jump " + jumpDistance
                + " meters forward and it would be nice to have " + GRAVITY + " gravity");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }
}
