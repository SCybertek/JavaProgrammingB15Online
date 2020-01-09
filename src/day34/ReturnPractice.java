package day34;

public class ReturnPractice {
    public static void main(String[] args) {
        //what is return keyword, when is used

        //break VS return
        //break --> loop: break out of the loop
        //      --> switch: break out of the case
        //      --> can we use it to control / exit method? NO!!!!
        //return --> inside a method
        //          return the value out of a method with return type
        //          the moment the return keyword is reached it will terminate the method
        //Can it be used in Void method?
        //  Yes, but only in this way : return;
        // what is the best of using in void method?
        //      to terminate the method early !!
        printMin4CharacterLengthName("Jon");
        printMin4CharacterLengthName("Java Shark");


    }

    public static void printMin4CharacterLengthName (String name) {

         // if the name less than 4 chars, get out out of the method
        if (name.length()<4){
            System.out.println("Invald NAME");
            return; // if we comment this out method will continue.. so even word with less than 4 char will print from line 31
        }
        System.out.println(name);
    }
}
