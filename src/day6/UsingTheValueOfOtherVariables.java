package day6;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {
        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber ;
        System.out.println("My Favorite Number " + myFavoriteNumber+
                        '\n' +"Your favorite number"+ yourFavoriteNumber);

        myFavoriteNumber = 200;
        System.out.println("My Favorite Number " + myFavoriteNumber+
                '\n' +"Your favorite number"+ yourFavoriteNumber);




        //task below




        String yourOrder = "meat with rice";
        String myOrder = yourOrder;
        System.out.println("Your order is "+ yourOrder);
        System.out.println("My order is "+ myOrder);


    }
}
