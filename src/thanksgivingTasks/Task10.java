package thanksgivingTasks;

public class Task10 {
    public static void main(String[] args) {

       /* Ask user to enter sentence with 3 words
        For example I love Java
        write a program to print second word

        */

       //steps:
        //second word is between first space and last space
        //getting location of space , remind me of INDEXOF
        //getting string inside another string by beginning and endging index
        // remind me of substring

        //index is the LOCATION

        //                 01234567890
      //String sentence = "I love Java";
//                         0123456789012345678901233456789012
        String sentence = "You Understand Java very very much";
        String secondWord;

        int firstSPaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = "+ firstSPaceIndex);
        
        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(1+1, 6)); //this we put while knowing the location

       secondWord = sentence.substring(firstSPaceIndex+1 , lastSpaceIndex);

        System.out.println("secondWord= "+ secondWord);

        //how to get a first word:
        //in plain english : first word starting from first character till first space

        String firstWord = sentence.substring(0,firstSPaceIndex);
        System.out.println("firstWord = " + firstWord);
        
        //how to get last word until the end
        
       // String lastWord =  sentence.substring(lastSpaceIndex);//with extra space
        String lastWord =  sentence.substring(lastSpaceIndex+1);
        System.out.println("lastWord = " + lastWord);

        //indexOf (another string,fromIndex)
        //you can not use this for sentences that have multiple spaces, longer sentences
        //indexOf(" ", firstSpaceIndex+1) it will give you an index of second space !!no matter how many you have
        
        int secodnSpace = sentence.indexOf(" ", firstSPaceIndex+2);
        System.out.println("secodnSpace = " + secodnSpace);
        
        int thirdSpace = sentence.indexOf(" ", firstSPaceIndex+3); // this does not catch !!
        System.out.println("thirdSpace = " + thirdSpace);
        /*
        only it will catch the 3rd space if the the second word is an article (a) or is a just 1 character ..
        for the 3rd space you need to use 2nd indexof(" ") +1 (edited) !!!!

         */



    }
}
