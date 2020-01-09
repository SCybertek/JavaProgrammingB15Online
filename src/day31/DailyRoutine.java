package day31;

public class DailyRoutine {
    public static void main(String[] args) {

        /*

        //these are methods that we want to create
        wakeup
        drinkCoffee
        prepareKidsToSchool
        goToWork
        groceryShopping
        cooking
        studyJava
        goToSleep

         */
        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayILoveJava300Times();


    }

    public static void wakeUp(){

        System.out.println("Open your eyes");
        System.out.println("Close it again");
        System.out.println("Hear your alarm");
        System.out.println("Open them again");
        System.out.println("---------------");
    }

    public static void drinkCoffee(){

        System.out.println("Put coffee in your coffee machine");
        System.out.println("Make your coffee");
        System.out.println("---------------");

    }

    public static void prepareKidsForSchool() {

        System.out.println("Wake them up");
        System.out.println("Feed them");
        System.out.println("---------------");
    }

    public static void takeThemToSchool() {

        System.out.println("Take them to school bus");
        System.out.println("Say good bye!!!");
        System.out.println("---------------");
    }

    public static void studyJava() {

        System.out.println("Think about Java while waking up");
        System.out.println("Thinks about Java making coffee");
        System.out.println("Think about Java while taking them to school");
        System.out.println("---------------");
    }

    public static void sayILoveJava300Times() {
        for (int i = 1; i <= 300; i++) {
            System.out.print("I Love Java | ");
        }
        System.out.println();

    }
}
