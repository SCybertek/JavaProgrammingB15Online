package day18;

public class ForLoopIntro {
    public static void main(String[] args) {


        //count 1 to 5

        // for loop () has 3 parts seperated by ;
        // first part initialization:
            // it will run only once when you enter the loop
        // second part termination condition:
           // loop will stop if its false
           // it will be checked everytime

        //third part increment or decrement to change condition eventually
            // it will run after each iteration ( it will run after you print and before you go check again your condition
            // i ++ or ++ i DOES NOT matter here


            int i = 1;
            for ( ;i <= 5; i++) {
            System.out.println(" i = " + i);
            System.out.println("Happy birthday to Roxana!!!");
        }


        for ( int counter = 5; counter>0 ; counter--){

            System.out.println(" counter" + counter );
        }
    }
}
