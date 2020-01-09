package day20;

public class ReversingAString {
    public static void main(String[] args) {

        //giving a String with value
        //reverse this name and store reversed vallue into
        //another string variable reversedName

        String name = "Jon Snow";
        String reversedName = "";

        System.out.print(name.charAt(7));
        System.out.print(name.charAt(6));
        System.out.print(name.charAt(5));
        System.out.print(name.charAt(4));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(0));

        System.out.println();

        for ( int x = 7 ; x >=0 ; x--) {

            //if we never knew a name and its index then

            //  int lastCharIndex = name.length()-1;

            System.out.print(x+ " index: ");
            
            char currentChar = name.charAt(x);
            
            System.out.println(currentChar);
            
            
            reversedName = reversedName + currentChar; 
        }
        System.out.println("reversed name : " + reversedName);

//        for ( int x = 7 ; x >=0 ; x--) {
//            reversedName = reversedName + name.charAt(x);
//        }
//
//        System.out.println(reversedName);




    }
}
