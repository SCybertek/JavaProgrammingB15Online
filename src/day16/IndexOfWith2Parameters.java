package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {


        // get the second java from the sentence
        //assume you alreadt know there is 4 Java in the sentence
        //second Java means - the java showed up after first Java

        //first find out where the location of the first Java
        //in order to find a second one,
        //instead of searching from beginning , search from right after the location you found the first Java
        //then it will give you the index of second java

        //But how do I start from different location when using indexOf
        //because Index of always start from the beginning (Itis not 0 .. but you can customize starting point

        //indexOf method has 2 version 1 expect 1 external data
        //another expect 2 external data -->> yourString.indexOf();
//                     012345678901234567890123456789013
        String name = "I love Java I love Java Java Java";

        System.out.println("starting from 0 : " + name.indexOf("Java"));
        System.out.println("starting from 7 : " + name.indexOf("Java",7)); //Start from different location
        System.out.println("starting from 8 : " + name.indexOf("Java",8));
        System.out.println("starting from 9 : " + name.indexOf("Java",9));
        System.out.println("starting from 19 : " + name.indexOf("Java",19));

       // System.out.println(name.lastIndexOf("Java", 18)); //-- 7 ?? // bunu sinifta etmedik biz!!!
       // System.out.println(name.lastIndexOf("Java", 28)); //-- 24 ??


        //how do I start from the location that get past first Java
        //basically starting point different that 0 so that it get [ast first Java

        int firstJavaLocation = name.indexOf("Java"); //location of first java in this case 7
        int startingPointToSearchSecondJava = firstJavaLocation +1 ; //yani 8den basliyor
        //or you can start here : = firstJavaLocation +4;  How do you know that +4??
        //because you know exactly how long is word Java. if it starts at 7 and lasts 4 spaces you can
        // start your search right after it finished. meaning +4

        //if we do not know the length of the word then--->>> +word.length ();

        int secondJavaLocation = (name.indexOf("Java", startingPointToSearchSecondJava));
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        // I DO NOT know how many words in this sentence
        //I just want to know what is the second word
        //lets assume there are more than 3 words in the sentence\
        //lets assume there is onlyk one space in between words
        //to find seocnd word you need to : find a word in between first and second space)

        int firstSpaceLocation = name.indexOf(" ");
       int secondSpace = name.indexOf(" ", firstSpaceLocation+1 );

        System.out.println("second word in this sentence is = " +
                name.substring(firstSpaceLocation+1, secondSpace)); //ends right before secondSpace




    }
}
