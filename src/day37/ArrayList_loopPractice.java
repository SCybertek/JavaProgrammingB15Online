package day37;

import java.util.ArrayList;

public class ArrayList_loopPractice {

    public static void main(String[] args) {

        //find longest name in List of String that contains 6 names

        ArrayList<String> nameLst = new ArrayList<String>() ;

        nameLst.add("Qulbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahaddin");
        nameLst.add("guzelnurin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");

        System.out.println("name list = " + nameLst);

        //Logic
        // assume that the first one is the longest one then compare each item length

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
        //System.out.println("longestName = " + longestName);

        // How do I get the concatenation of all longest words if there are more than one
        // first find out the longest word , and get the character count
        // then loop through each names
        // and check whether character count equal to longest word character count
        for (int i = 0; i < nameLst.size(); i++) {

            if (nameLst.get(i).length() == longestName.length()) {
                System.out.println("Longest words = " + nameLst.get(i));
            }

        }

        // length     :  counting the elements inside array , it's a property of array object
        // last element of an array :  arr[arr.length-1]
        // length()   :  counting the characters inside String , it's a method of String object
        // last char of a String :  str.charAt( str.length() -1 )
        // size()     :  counting the elements inside ArrayList object, , it's a method of List Object
        // last element of an arrayList :  lst.get( lst.size()-1 )

        System.out.println("_--------------------------"                );

        for ( String currentName : nameLst)  {
            System.out.println("currentName = " + currentName);
        }




    }
}
