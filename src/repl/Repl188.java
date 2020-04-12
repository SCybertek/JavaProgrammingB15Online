package repl;

public class Repl188 {

    public static int findMax ( int [] nums ) {

      int max = nums[0];
       for (int each : nums) {
           if (each > max) {
               max = each;
           }
       }return max;
    }

    public static double findMax ( double [] nums ) {

        double max = nums[0];

        for (double each : nums) {
            if (each > max) {
                max = each;
            }
        }return max;
    }
}
