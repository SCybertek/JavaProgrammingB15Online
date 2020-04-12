package repl;

import javax.swing.plaf.IconUIResource;

public class Repl159 {
    public static void main(String[] args) {
        //finding unique once in Array

        int [] nums = {2,5,5,6,3,6,9,34,3};

        for (int i = 0 ; i < nums.length ; i++ ) {
            int counter = 0 ;
            for ( int j = 0 ; j < nums.length ; j++) {
                if ( nums[i] == nums[j]) {
                    counter++;
                }
            }
            if (counter ==1 ) {
                System.out.println(nums[i]);
            }
        }

    }
}
