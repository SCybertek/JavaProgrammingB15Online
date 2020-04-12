package repl;

public class Repl174 {

    public static void main(String[] args) {
        //finding unique once

        int [] nums = { 2,5,5,6,3,6,9,34,3};
        printUniqueNumbers(nums);

    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

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
