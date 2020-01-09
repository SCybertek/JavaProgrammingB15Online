package day14;

public class LastIndexOf {
    public static void main(String[] args) {
        //             012345678
        String name = "Game of Java"; // count or length is 12, last char index is 11

        //find out last location the letter a shows up
        System.out.println("find out last location the letter a shows up");
        System.out.println(name.lastIndexOf("a"));

        //find out last location the space shows up
        System.out.println(name.lastIndexOf(" "));

        //find out last location the letter Ga shows up
        System.out.println(name.lastIndexOf("Ga"));

        //find out last location the letter Kawa shows up
        System.out.println(name.lastIndexOf("Kawa"));

        //if I dont use contain method what will be my condition
        // to check whether we have Kava in the String
        //contain with IndexOf:

        if ( name.indexOf("kawa")> -1 ){
            System.out.println("Kawa is found");
        } else {
            System.out.println("No Kawa- no pumpkin");
        }

        //
    }
}
