package day40;

public class HotMarketAction3 {
    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = false;
        o1.salary = 140000;



        o1.displayInformation();
        o1.turnToFullTime();
        o1.turnToFullTime();
        o1.changeLocation("DC");
        o1.displayInformation();

        o1.changeAllInfo("Hubspot" , "Boston" , 250000 , true);
        // we have to call the method in the same order it was created in the template !!

        //o1.displayInformation(); no need for this anymore

        // this below is my try of calling a method that has another method inside:
        o1.change2Things("Waltham" , "Blabla");
        o1.displayInformation();

        //if this guy earns more than 100 k
        // move him to Atlanta

        boolean result = o1.is100KOffer();
        // we can store into boolean that because is100KOffer() has a return type

        System.out.println("Is it 100K offer ? " + o1.is100KOffer());

       // if (result == true) {
            // another version of this code
            if (o1.is100KOffer() ) {
            o1.changeLocation("Atlanta");
        }
        o1.displayInformation();

        // this is SPECIAL PAY ATTENTION:
        String o1Str = o1.toString();
        System.out.println("o1Str = " + o1Str);

       // this is just calling the return method
        System.out.println(o1.toString());

        System.out.println("o1 = " + o1);
        // we could not do that before..
        // if you directly print out an Object , it will call toString() method automatically
        // automatically from the PARENT
        // compiler will auto call for me
        System.out.println(o1); // this is what is automatically  happening behind the scene o1.toString()






    }
}