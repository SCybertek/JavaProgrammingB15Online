package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {
    public static void main(String[] args) {


        //// Create a method that accept a List of String as argument
        //// same thing as a method that has List of String parameter
        //// and print out each and every item in the list vertically
        //// return nothing

        List<String> nameLst = new ArrayList<String>() ;
        //ArrayList <String > nameLst

        nameLst.add("Qulbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahaddin");
        nameLst.add("guzelnurin");
        //calling this method

       printAList( nameLst );
        // when we change ArrayList to List it cannot call the method printAList (nameLst) ;
        //why?


    byte myByte = 17 ;
    printByte(myByte);

    int myInt = 100 ;
    printByte( (byte) myInt ); // we hav eto cast this .
        // thast why List is a more general type than ArrayList
        // when you call ArrayList method for List it is the same
        // you are trying to put a grande coffee cup into a midium
        
        
        String resultLongest = getLongestElement(nameLst);
        System.out.println("resultLongest = " + resultLongest);


    }


    public static void printByte (byte b) {
        System.out.println("You passed byte value = " + b);
    }

    /**
     *
     * @param lst of String
     * @return nothing
     */
    public static void printAList (List <String> lst) { // parameter here is ArrayList
        //everything else about creating method is the same
        // We CHANGED FROM arrayList to List .. increased the cup.. made it more general

        
        for (String each: lst) {
            System.out.println("each = " + each);
        }
            
        }

        //write a method that accepts a List and return String ( the longest word )
    public static String getLongestElement ( List <String > nameLst ) {

        String longestName = "";
        // or nameLst.get(0);

        for (int i = 0; i < nameLst.size() ; i++) {

            String currentName = nameLst.get(i);

            if (currentName.length() >=longestName.length()) {
                // > will give your first longest name if you have more than one
                // >= will give you last longest name if you have more than one
                longestName= currentName ;
            }
        }
        return longestName;
    }

    }

