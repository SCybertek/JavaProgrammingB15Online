package day42;

public class BikeAction {

    public static void main(String[] args) {

        Bike b1 = new Bike("abc") ;
        Bike b2 = new Bike() ;
        System.out.println(b1); // day42.Bike@77459877



        // I dont want empty gear when object is created
        // i want bike to come with gear set 1

        // give me the Bike that has default of value of 1 :
        // this is 1 purpose of constructor: to change something while object is beeing created
        // so that we don't create empty object .. we can have object with initial state

        System.out.println("b1 gear = " + b1.gear);
        System.out.println("b2.gear = " + b2.gear);

        // I wan to be able to set the default gear to any number I specify when object being created
        
        Bike b3 = new Bike (4 ) ;
        System.out.println("b3.gear = " + b3.gear);

        // I want the Bike object with both 
        // speed and gear set the value I specify 
        
        Bike b4 = new Bike(5,8) ;
        System.out.println("b4.gear = " + b4.gear);
        System.out.println("b4.speed = " + b4.speed);


    }

}
