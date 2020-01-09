package day21;

public class TaskX_OddNumberPrint {
    public static void main(String[] args) {
        /*
        Store your name in variable
        loop through each and every letter
        and print
        if you see letter n - get out

         */

        String name = "Sofiya Nuryyeva";
        int charCount = name.length();

        for (int i = 0; i <=charCount-1; i++) {
          //  System.out.println(name.charAt(i));


            char currentChar = name.charAt(i);
            System.out.println(currentChar);

            if (currentChar == 'N') { // you can add || and ask 'n' lowercase n
                System.out.println("Found it!!");
               break;
            }

        }

        for (int i = 0; i < name.length(); i++) {
            String currentChar = name.substring(i,i+1);
            if (currentChar.equalsIgnoreCase("v")){
                System.out.println("FOUND IT!!");
                break;
            }
            System.out.println(currentChar);

        }

        //optional chain the method saving each char

        for (int i = 0; i <name.length() ; i++) {
            if (name.substring(i,i+1).equalsIgnoreCase("e")){
                System.out.println("Found It!!");
                break;
            }
            System.out.println(name.substring(i,i+1));
        }
    }
}
