package day35;

public class CharacterPractice2 {
    public static void main(String[] args) {

        String str = "A34B123C4X";
        //for each char is string check if it is number
        //if yes store in a string and use that string to get Integer
        //then sum it up

        /// COPY PASTE CHAR TO STRING from ngithub

        int sum = 0 ;

        char[] allChars = str.toCharArray();
        for ( char each: allChars) {
            if ( Character.isDigit(each)) {
                System.out.println("each : " + each);
                int a = Integer.parseInt(each+""); //parse it accepts only string that swhy we added ""
                sum = sum + a;
            }

        }
        System.out.println(sum);
    }
}
