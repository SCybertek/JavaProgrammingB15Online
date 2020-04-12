package repl;

import java.util.Arrays;

public class Repl130 {
    public static void main(String[] args) {

        // array shifting to the left :
        // logic
        // 0  1  2  3                     0  1  2  3
        // 6, 7, 8, 9   ---- becomes ---- 7, 8, 9, 6
        // 6 becomes 7
        //
        int[] nums = {6, 7, 8, 9};

        for (int i = 0; i < nums.length; i++) {

            if (i != nums.length - 1) {

                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

