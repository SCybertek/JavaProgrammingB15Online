package selfStudy;

public class StaticBlock {



    static int age ;
    static String batch ;



    public StaticBlock () {
        System.out.println("Constructor");
    }

    static {

           age = 8 ;
            batch = "15";
    }

    public static void main(String[] args) {

        //String age;
        System.out.println("This is age " + age );
        age = 67;
        System.out.println("age = " + age);


    }
}
