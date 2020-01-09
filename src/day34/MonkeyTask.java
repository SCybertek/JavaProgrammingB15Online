package day34;

public class MonkeyTask {
    public static void main(String[] args) {
        //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        // We are in trouble if they are both smiling or if neither of them is smiling.
        // Return true if we are in trouble.
        //
        //For example :
        //monkeyTrouble(true, true) → true
        //monkeyTrouble(false, false) → true

        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(false, false));
    }

//    public static boolean monkeyTrouble (boolean aSmile, boolean bSmile) {
//        return (aSmile==true && bSmile==true) || (aSmile==false && bSmile==false);
//    }


    public static boolean monkeyTrouble (boolean aSmile, boolean bSmile) {

//if (aSmile && bSmile || !aSmile && !bSmile)
// return aSmile == true && bSmile == true;

        return aSmile == bSmile; // this is only for compiler
    }

}
