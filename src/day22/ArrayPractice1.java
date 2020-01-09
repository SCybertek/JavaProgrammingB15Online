package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {
        double[] prices = new double[5];

        System.out.println(prices[0]);

        // can NOT print out array variable directly
        // to see what's inside
        System.out.println(prices);

        prices[0] = 2.46;
        prices[1] = 12.96;
        prices[2] = 992.1;
        prices[3] = 500;
        prices[4] = 65.123;
        // what happen if I go over the range
        // RUN TIME ERROR!!!!!!
        //prices[5] = 165.3 ;


        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);


        //  // Create a char array that hold all the letters from your first name
        //        // and assign values using each characters of your first name
        // then print out each character
        char[] nameChars = new char[5];
        // What default value do we get for char array
        // we get a char represented by ascii code 0
        System.out.println("<" + nameChars[0] + ">");


        char[] name = new char[6];
        name[0] = 'S';
        name[1] = 'o';
        name[2] = 'f';
        name[3] = 'i';
        name[4] = 'y';
        name[5] = 'a';

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);

        System.out.println(name);//this will print the content of the array !!NOT memory address!
        //this works only for CHAR ARRAY!!
        //anything else will print MEMORY ADDRESS!!!!
        //NOTHING ELSE DOES IT !! only char array

        /// BOOLEAN
        boolean[] yesNo = new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);
        //in boolean if we do not give any value to char then it willprint FALSE

        yesNo[0] = true;
        yesNo[1] = false;
        yesNo[2] = 10 > 7;//true

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);


    }
}
