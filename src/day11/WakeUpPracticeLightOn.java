package day11;

public class WakeUpPracticeLightOn {
    public static void main(String[] args) {
 // You have 4 switches in your home to turn on
       /*

       Create variable : targetOption as String and assing one of below option

         Bd-- bedroom
         Lr--living room
         Ki-- kitchen
         Ha--hallway

         Use switch statement
         For example if Bd was targetOption then print you have turned on Bedroom light
        */


       /*
       Pseudo code:

       there is targetOption to store my option
       and it looks it has 2 character so I USE String as data type
        */

       String targetOption = "Bd";

       // what can be the data type variable inside the switch ?
        // byte, short , int, char, String


       switch (targetOption) {

            case "Bd":
                System.out.println("You have turned on Bedroom lights");
                break;

           case "Lr":
               System.out.println("You have turned on Living room lights");
               break;

           case "Ki":
               System.out.println("You have turned on Kitchen lights ");
               break;

           case "Ha":
               System.out.println("You have turned on hallway lights");
                break;
           default:
               System.out.println("There is no room that you mentioned");
               break;

        }






    }

}
