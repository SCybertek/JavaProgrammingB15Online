package day09;

public class LanguagePicker {
    public static void main(String[] args) {

        //Language picker
        // create variable called languageOption and assign value
        //String variable called greeting . assign empty String
        // Assume you are on call and greeted by
        // 1-->"hello
        //2 --> Salam
        //3- "Hola"
        //4 - "Privet"


        /* the program should set the value of a String variable called greeting to this value:
        1--> "Hello.SDET"
        Print out --> this is the greeting you get: Hello,sdet"

         */

        String languageOption = "Russian";
        String greeting = "";

        if (languageOption == "Russian") {
            greeting = "Privet";
        } else if (languageOption == "Turkish") {
            greeting = "Selam";
        } else if (languageOption == "Spanish") {
            greeting = "Hola";
        } else if (languageOption == "French") {
            greeting = "Bonjour";
        } else {
            System.out.println("I dont understand you!");

        }

        System.out.println(greeting + ",SDET!!!");


    }
}
