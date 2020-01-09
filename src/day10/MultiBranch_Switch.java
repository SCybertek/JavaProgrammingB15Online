package day10;

public class MultiBranch_Switch {

    public static void main(String[] args) {
        //at Macdonalds menu

        System.out.println("welcome to McDonald, what can I get for you? ");
        /*
        11 burger
        5 french fry
        8 nuggets
        35 ice cream
        55 coke

         */

        String order ="";
        int itemNumber =11;
        switch (itemNumber){
//byte, char,short.int,string ONLY!!!!
            case 11:
            System.out.println("You hve selected 11");
            order = "Burger";
            break; // it is very important!

            case 5:
            System.out.println("You have selected 5");
            order = "French Fries";
            break;

            case 8:
            System.out.println("You have selected 8");
            order = "nuggets";
            break;

            case 35:

            System.out.println("YAAAYYY");
            System.out.println("YOU have selected 35");
            System.out.println("Enjoy");
            order = "Ice cream";
            break;

            default:

            System.out.println("YOu have selected unknown");
            order = "unknown";
            //break; optional here

        }
        System.out.println("Your order is "+ order);


    }
}
