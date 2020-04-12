package repl;

public class Repl152 {
    public static void main(String[] args) {


        //Create a method called plus_minus that gets an array of ints (int[]),
        // it outputs how many negative , positive and zero numbers are in the array.


    }
    public static void plus_minus ( int[] arr) {
        int countPositive = 0 ;
        int countNegative = 0 ;
        int countZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > 0) {
                countPositive++;
            } else if (arr[i] < 0) {
                countNegative++;
            } else if (arr[i] == 0) {
                countZero++;
            }
        }
        System.out.println(countNegative);
        System.out.println(countPositive);
        System.out.println(countZero);
    }

}
