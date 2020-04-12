package day40;

public class Offer {


    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is a instance method to print all the information about Offer object
     * no parameter and no return type
     */
    // inside instance method we can directly access instance variable

    public void displayInformation() {

        System.out.println("Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime);

    }

    //write a method called turnToFullTime

    public void turnToFullTime () {

        if ( isFullTime == false ) {

            isFullTime = true ;
        } else  {
            System.out.println("ALREADY FULL TIME");
        }
    }


    // the state of an object : the currect data that you hold
    // state attribute and property are all the same thing!
    // task : write a method to change the location of the Offer
    // to the location user passed

    public void changeLocation ( String newLocation ) {
        location = newLocation ;
        // this is a template
        // we need to send it/ call the method to use
    }

    //write a method to accept 4 parameters to change all info about offer

    public void changeAllInfo (String newCompany , String newLocation,
                               long newSalary, boolean newIsFullTime) {
        company = newCompany ;
        location = newLocation ;
        salary = newSalary ;
        isFullTime = newIsFullTime ;
        displayInformation(); // calling a method inside a method
        // an instance method can call another instance method
        //an instance method can use any instance fields!

        //we can call earlier method changeLocation in here as well

    }

 public void change2Things ( String newLocation, String newCompany) {
        changeLocation(newLocation);
        company = newCompany;
 }

    // write a method to check the offer belongs to 100K club

    /**
     * a method to check the offer belongs to 100K club
     * @return true if salary is more than 100 , false if not
     */

    public boolean is100KOffer () {
        // salary >= 10000 already generated a boolean result
        // so we can directly return that result
        return salary >= 100000 ;
    }

    // create an istance method toString
    // no parameter
    // return String representation of offer object

    public String toString () {
        // or we can also store :
        // String str = "[Location = " + location + " | " +
        //                "Company = " + company + " | " +
        //                "Salary = " + salary + " $ | " +
        //                "isFullTime = " + isFullTime + "]"

        return "[Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " $ | " +
                "isFullTime = " + isFullTime + "]";
    }
// even after commenting itout we still DO NOT SEE RED ON THE OTHER SIDE!!
    //because we have toString inherited from Parent that we don't know yet

    }
    // CONSOLE CANNOT EVER READ AN OBJECT !
// it will try to convert it toString first

