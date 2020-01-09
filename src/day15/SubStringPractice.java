package day15;

public class SubStringPractice {
    public static void main(String[] args) {
        //getting the part of the String out of another String
        //              0123456789012345
        String movie = "Lord of The Ring ";
        //subsring will return part of another string
        //starting from beginning index until RIGHT BEFORE ending index 

        String wordOf = movie.substring(5,7);
        System.out.println("word of = "+ wordOf);

        //I want to get the word Of from this movie
        
        
        //get the word THE 
        
        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        //get from the second word to the last word
        //                0123456789012345
        //String movie = "Lord of The Ring ";

        // find the first space index , second word start right after first space so thats our starting point
        //my ending point is one more than last index (thus it is length)

        int startingPoint = movie.indexOf(" ")+ 1;
        int endingPoint = movie.length();

        System.out.println("second word till last : "+ movie.substring(startingPoint, endingPoint));

       
        
        String secondWordTillLast = movie.substring(5,16);
        System.out.println("secondWordTillLast = " + secondWordTillLast);

        // if you want to start from somewhere and just get the rest of the String
        //above method will work, however there is even better method
        // if youprovide only one parameter to substring method it will provide everything after that starting point

        String secondToLast = movie.substring(5);
        System.out.println("secondToLast = " + secondToLast);

        //Lord of 
        
        String lordOf = movie.substring(0,7);
        System.out.println("lordOf = " + lordOf);

        //the most important part is to know that ENDING part should be +1 or it will not include it


        //task:
        //you know the index already
        // //                     0123456789012345
        //        String movie = "Lord of The Ring ";
        //reverse lord of the ring -->> Ring The Of Lord

        String reverse1 = movie.substring(12,16);
        String reverse2 = movie.substring(7,11);
        String reverse3 = movie.substring(4,8);
        String reverse4 = movie.substring(0,4);
        System.out.println("This is the reverse : "+ reverse1+reverse2+reverse3+reverse4);

        // Ring of the Lord

        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String wordLord = movie.substring(0,4);
        System.out.println(wordRing+wordOfThe+wordLord);


        //TURN -->> Lord Of The Ring -->> Ring Of The Java Lord

        System.out.println(wordRing+wordOfThe+"Java "+wordLord);
        //IF you dont know INDEX = you should use INDEXOF to find the number first



    }
}
