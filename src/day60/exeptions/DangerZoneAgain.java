package day60.exeptions;

import java.io.FileNotFoundException;

public class DangerZoneAgain {

    public static void main(String[] args) throws InterruptedException {

        //HANDLE or DECLARE are our 2 ways to deal with exceptions
        //if we are sure that method will never actually throw exception
        //its good to just declare it to go through compiler to make it happy
        //if there is actullly a chance for the exception might left unhandled
        // it is good to wrap up under try and catch block


        //calling a method that declare to throws checked exception
        //this MIGHT give you some error, but maybe NOT
        //we used THROWS instead because we know that there is NO objcet thrown in the method so we do need extra TRY catch block code



       try {
           readMyFile();


       } catch (FileNotFoundException e) {
           System.out.println("this file does not exist"); //this code is not read because there is no exception THROWN IN the method we are calling
           e.getMessage();
       }

        Thread.sleep(3000);
        //thread class is class coming from java.lang package
        // it has a method called sleep and it will let your program pause for x milliseconds
        System.out.println("The End");


    }

    //document this method to tell the caller, the file you are about to read might not exist
    //and handle the consequences yourself
    //the exception type alredy exists for this type of situations it is called
    //FileNotFoundException from java util package
    public static void readMyFile () throws FileNotFoundException {
        System.out.println("Reading the file in my computer ");
        throw new FileNotFoundException("Kaboom! file is not here!!") ; //now we have an objcet that is being thrown..
        //we have declared it in method signature.. but nobody handled it!! so it will compile BUT WILL HAVE RUNTIME ERROR!
        // java.io.FileNotFoundException: Kaboom! file is not here!!
    }
}
