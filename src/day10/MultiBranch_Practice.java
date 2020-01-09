package day10;

public class MultiBranch_Practice {

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
        int itemNumber =35;

        if (itemNumber==11) {
            System.out.println("You hve selected 11");
            order = "Burger";
        } else if (itemNumber==5) {
            System.out.println("You have selected 5");
            order = "French Fries";
        } else if (itemNumber == 8) {
            System.out.println("You have selected 8");
            order = "nuggets";
        } else if (itemNumber== 35) {
            System.out.println("YAAAYYY");
            System.out.println("YOU have selected 35");
            System.out.println("Enjoy");
            order = "Ice cream";
        } else {
            System.out.println("YOu have selcetd unknown");
            order = "unknown";
        }
        System.out.println("Your order is "+ order);


    }
}
