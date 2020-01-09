package day13;

public class WarmUp_NestedIfStatement {

    public static void main(String[] args) {

        //create a boolean store the result of doYouWantToShop
        //if yes, do you want to go to store or shop online
        // if  user do not want to shop , "stay home and code"


        boolean youWantToShop = false;
        String preference = "Online";
        //if (youWantToShop)
        if (youWantToShop == true) {

            if (preference.equals("Store")) {
                System.out.println("Going to store for shopping");
            } else {
                System.out.println("Going online to shopping");
            }


        } else {

            if (preference.equals("Online")) {
                System.out.println("Shop on Amazon"); // I put in this nested If myself
            } else {

                System.out.println("Good Job! Stay home coding!!");
            }


        }
    }
}