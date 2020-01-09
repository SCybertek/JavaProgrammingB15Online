package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
        //


        String myStr = "Java";
        System.out.println(myStr.equals("Java"));

        //intelliK display original as helper, its not part of your code
        //please ignore and keep typing. do not type original just type your text

        String yourStr = new String("Java");

        System.out.println("is my string same as your string ? ");
        //how to compare mystr to yourstr for equality

        System.out.println(  myStr.equals(yourStr)    );

        //create a program to check whether my str value is java
        // if true -->. correct word!
        // if false --> say Java!!

        if (myStr.equals("Java")) {
            System.out.println("Correct Word!!!");
        } else {
            System.out.println("Say Java!!!");
        }




    }
}
