package repl;


import java.util.Arrays;

public class Repl124 {
    public static void main(String[] args) {
        //swapping arrays elements  by leaving the mid.num unchanged
        int [] nums = { 4,3,2,44,1,100,55};
        int lastIndex = nums.length-1;


        for (int i = 0; i < nums.length/2; i++) {
            System.out.println(nums[i]+ "-------" + nums[lastIndex-i]);
            int temp = nums [i];
            nums[i] = nums[lastIndex-i]; // 55 is last digit
            nums[lastIndex-i] = temp; // 4 is first digit



        }
        System.out.println(Arrays.toString(nums));
    }
}
