package day33;

public class GotEmailPractice {

    public static void main(String[] args) {

        System.out.println(getSumFrom1toX(3) );

        System.out.println(build_Got_Email("Sofiya","Stark"));

        //you are given a variable fullName that has first name and last name
        // use this data to generate email

        String fullName = "Susan Cure";
//        String part1 = fullName.split(" ")[0];
//        String part2 = fullName.split(" ")[1];
//        //store this in email
//        String herEmail = build_Got_Email(part1,part2);
//        System.out.println(herEmail);

        //or even better code, with one split

        String[] fullNameSplit = fullName.split(" ");
        String herEmail = build_Got_Email(fullNameSplit[0], fullNameSplit[1]);

        System.out.println("herEmail = " + herEmail);


    }
    /*
    create a method: getSumFrom1toX
    This method calculates teh sum of numbers from 1 to the number user askes
    @param x the final number to be added
    @return the sum of numbers from 1 to x
     */

    public static int getSumFrom1toX (int x) {

        int sum =0;
        // TODO: YOUR CODE GOES HERE

        for (int i = 0; i <= x; i++) {
            sum+=sum+i;

        }
        return  sum ;
    }

//    * build_GOT_Email
// * This method should build email using user's first and last name
//            * for example Jon Snow --->> JSnow@NightWatch.com
// * @param firstName user's first name
//            * @param lastName  user's last name
//            * @return the email created using
// * firstName initial+lastname+@NightWatch.com

    public static String build_Got_Email (String firstName, String lastName) {

        String email = firstName.charAt(0)+lastName + "@NightWatch.com";
        return email;
        //return firstName.substring(0,1)+lastName+"@NightWatch.com";
    }

}
