package day40;

import java.util.ArrayList;

public class HotMarketAction {
    public static void main(String[] args) {

        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();

        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company = "Google";
        o2.salary = 100000;
        o2.isFullTime = true;
        o2.displayInformation();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Vancouver";
        o3.isFullTime = true;
        o3.salary = 96000;
        o3.displayInformation();

        Offer o4 = new Offer();
        // if we don't assign values for instance filed|variable
        // we get default value
        // for primitive numbers : 0 or 0.0
        // boolean : false
        // char    : ''
        // for any reference types :
        // null
        o4.displayInformation();
        // creating ArrayList of Offer to store multiple offer objects
        ArrayList<Offer> myOffers = new ArrayList<>();

        // List<Offer>myOffers=newArrayList<>(Array.asList(o1,o2,o3,o4)); this is a short way
        // we did not use thi because this above creates a new arraylist?
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        myOffers.add(o4);

        //System.out.println("myOffers = " + myOffers); do n ot print like this // we will get back to this later again!
        // output : [day40.Offer@7ef20235, day40.Offer@27d6c5e0, day40.Offer@4f3f5b24, day40.Offer@15aeb7ab]

        System.out.println("myOffers ---------------------------");

        for (Offer each : myOffers) {

            each.displayInformation();


        }

        //looping with for loop :

        System.out.println("myOffers ---- for loop -------------");

        for (int i = 0; i < myOffers.size() ; i++) {
            //2 ways storing and not
            //store each item into variable into variable each:

            Offer each = myOffers.get(i);
            each.displayInformation();
            //this is one shot version
            //myOffers.get(i).displayInformation();
        }
    }
}
