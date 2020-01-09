package day30;

import java.util.Arrays;

public class CarInventory {
    public static void main(String[] args) {

        /* task 1:
        create an array with these:
        {
"Acura-NSX",
"Chevrolet-Corvette",
"Chevrolet-Cavalier",
"BMW-3 Series",
"Pontiac-LeMans",
"BMW-7 Series",
"Oldsmobile-Achieva",
"Honda-Civic"}
(edited)
         */

        String[] carNameModel = {"Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        //count how many Chevrolet
        // to find something from String Array we have to go in each and every item of an array. lets try fori loop

        // String copyToArray = Arrays.toString(carNameModel);
        int counterChevi = 0;
        int counterCivic = 0;
//        for (int i = 0; i < carNameModel.length; i++) {
//            if (carNameModel[i].contains("Chevrolet")) {
//                counterChevi++;
//            } else if (carNameModel[i].contains("Civic")) {
//                counterCivic++;
//            }
//        }
//        System.out.println("Chevrolet: " + counterChevi);
//        System.out.println("Civic: " + counterCivic);

        // second way with for loop cince we dont need index:

        for ( String eachCar : carNameModel) {
            if ( eachCar.toLowerCase().startsWith("chevrolet")) {
                counterChevi++;
            }
            if (eachCar.toUpperCase().contains("CIVIC")){
                counterCivic++;
            }
        }
        System.out.println("counterChevi = " + counterChevi);
        System.out.println("counterCivic = " + counterCivic);
    }
}