package day3;

public class PrimitivePractice {
    public static void main(String[] args) {

        byte letterCount = 26;
        short sheepCount = 300;
        int catCount = 20;
        long mileToSun = 1000000L;
        System.out.println("The mile to Sun is" + mileToSun );
        long mileToMoon = 5000000l;
        System.out.print("The distance to the Moon is " + mileToMoon);
        //------------------floating point----
        //you must add f at the end of number to indicate this is float data type
        //upper or lowercase does not matter. But it has to be there
        float priceOfBanana = 1.99f;
        System.out.println("The price of banana is "+ priceOfBanana);
        float priceOfPotato = 2.49F;
//----- large floating point numbers---
        double priceOfIpad1 = 355.99d ;
        double priceOfIpadPro = 1024.99D ;
        //complier automatically assume its a double so its not required to have d
        // however for good programming habbit, add them always
        double priceOfMac     = 2299.99;

        //If you have a whole number by itself, compiler automatically assume it's an int
        //If you have a fractional number by itself, compiler automatically assume it's a double

    }
}
