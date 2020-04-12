package repl;


import java.util.ArrayList;
import java.util.Arrays;

public class Repl202 {

    public static void main(String[] args) {

        //final int x = 34;



        ArrayList<Integer> nums = new ArrayList<Integer> (Arrays.asList(1,2,3,4));
        timesTwo(nums);
    }

    public static void timesTwo(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size(); i++) {
           nums.set(i,nums.get(i)*2);

        }
        System.out.println(nums); // printikng or no printing it accepted.. but probaly printing is better since it is void method

    }


}
