package day60.exeptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DangerZoneAgain2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("The Start!");

        readMyFile();

        Thread.sleep(3000);

        System.out.println("The End");

        //program runs smoothly! the FISH is ALWAYS caught!
        // can we HAVE A NESTED TRY CATCH??? !! YES YES and YES like nested if statement!

    }

    //document this method to tell the caller, the file you are about to read might not exist
    //and handle the consequences yourself
    //the exception type alredy exists for this type of situations it is called
    //FileNotFoundException from java util package
    public static void readMyFile() {
        System.out.println("Reading the file in my computer ");
        try {
            //throw new FileNotFoundException("Kaboom! file is not here!!");
            List<String> allLines = Files.readAllLines(Paths.get("src/day60/hero.txt"));
            //this .readAllFiles throws exception .. why?
            //My understanding is, whenever someone is calling this method he/she has to add extra data —
            // which file they want to read. and Java people want to play it safe
            // by adding exception so that the flow of the program does not stop but there is a MUST handling of the method
            System.out.println("allLines = " + allLines);
        } catch (FileNotFoundException e) {
            System.out.println("AHA!! caught you here! in readMyFile!");
        } catch ( IOException b) {
            System.out.println("This is a super class of FileNotFound class exception and we have to add this next catch block");
        }
        }
    // Files is a class coming from import java.nio.file package;
    // it has lots of file related utility.
    // readAllLines static method is easiest way to read a text file (including csv file)
    // it accepts a file path as argument and return all lines in a List of String
    // readAllLines method declares( document ) to throw IOException
    // IOException is a checked exception -->> must be handled or declared

    // quick side bar : FileNotFoundExcepion is sub class of IOException

    }

