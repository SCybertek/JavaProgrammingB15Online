package repl;

public class Repl122 {
    public static void main(String[] args) {

        //logic:
        //take first number of an array and compare it with the rest.. if it is repeated again then count
        //create second loop and compare second numebr with the rest
        //increase count if it appears again
        //print the one that appeared only once

        int[] nums = {1, 1, 2, 3, 4, 3, 4};



        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(nums[i]);
            }
        }
    }
}




