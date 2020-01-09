package day08;

public class IfElseStatement {
    public static void main(String[] args) {

        int speedLimit =60;
        int yourCurrentSpeed =100;

        //if the current speed is more than speed limit
        //get pulled over the police
        //given ticket by the police
        //taken away some points from your licence
        //go to cort

        //if not over the limit
        //go shopping!!
        //

        //outside if statement, say the end

        boolean iAmSpeeding= ( yourCurrentSpeed > speedLimit ) ;
        //Inside Paranthesis we can ONLY put
        //boolean value (true or false)
        //boolean variable
        //any expression that return boolean value

        //if (iAmSpeeding) {
        //if (true) { // not used so much because if you say if tru then it will always be true (?)
        if (yourCurrentSpeed>speedLimit) {

            System.out.println("get pulled over the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points from your licence");
            System.out.println("go to cort");
        }
        else {
            System.out.println("Go Shopping!");
            System.out.println("Buy IceCream!");
            System.out.println("Enjoy your day!");

        }

        System.out.println("The END");
    }

}
