package repl;

import java.util.Scanner;

public class Repl136 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt()};
        // consecutive 5 .. if exists then true else false

        // we have to use for loop here lets see

        boolean result = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 5) && (nums[i + 1] == 5)) {
              result = true;
            }
        }
        System.out.println(result);
    }
}
