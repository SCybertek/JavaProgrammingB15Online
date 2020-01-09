package day33;
/**
 * Practice method with return type
 *
 * @author Akbar
 * <p>
 * return keyword is used to return a value out of a method
 * it alos used to get out of your method
 * the moment the return line get executed , the method will finish running
 */

public class ReturnKeywordPractice {
    public static void main(String[] args) {


        System.out.println(calculateAndReturnAge(1989));
        System.out.println(calculateAndReturnAge(1770));
    }

    /**
     * Write a method accept a birth year and return the age :
     * the birth year should be within the range of 1900-2020
     * if not return 0
     * optionally : test your code against array of birthYears
     * {1999,122,2019, 1987, 1978,1964,3999, 2004}
     * @param birthYear
     * @return age
     */


    public static int calculateAndReturnAge (int birthYear) {

        // I want to take out negative scenario first and just return 0
        if (birthYear <= 1900 || birthYear >= 2020) {
            return 0;

            //do not use SOUT in METHODS you want to call!!!!!!!!!!!!
        }
        // If I reach this point , it means the birth year is valid
        return 2019 - birthYear;


    }
}
