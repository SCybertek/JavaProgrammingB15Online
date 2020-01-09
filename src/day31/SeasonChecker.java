package day31;

public class SeasonChecker {
    public static void main(String[] args) { // method header


        String mySeason = "AAA"; // you can directly pass aaa eto the method or its varibale where it is strong

        // we used season why?
        //this season is a String variable declared and assigned value inside main method
        // it can be accesible in main method
        // do these two seasons are aware of each other existence? NO
        // so, they are not in conflict !!

        decideSeasonAction("Winter");
        decideSeasonAction("Summer");

        decideSeasonAction(mySeason);


        System.out.println("AAA");
        System.out.println(mySeason);





    }
    // write a static method called called decideSeasonAction
    //it has one string parameter called season
    //inside the method body :
    // according to what user passed it should print correct action

    public static void decideSeasonAction (String season) {
        // season down is method parameter , which is accessible inside method body
        switch (season) {

            case "Spring" :
                System.out.println("Hiking");
                break;
            case "Summer" :
                System.out.println("Swimming");
                break;
            case "Fall" :
                System.out.println("Pumpkin picking");
                break;
            case "Winter" :
                System.out.println("Go Snowboarding ");
                break;
            default:
                System.out.println("Invalid Season");



        }

    }

}
