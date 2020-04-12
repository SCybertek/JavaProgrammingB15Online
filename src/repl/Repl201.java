package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl201 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,-6, 3 , -8, 0 , 4 , 3));
        System.out.println(appendPosSum(nums) );


    }

    public static ArrayList<Integer> appendPosSum (ArrayList<Integer> nums) {
        Integer sum = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for ( int x = 0; x < nums.size(); x ++) {

            if (nums.get(x) > 0 ) {

                list.add(nums.get(x));
                sum += nums.get(x);
            }


        }

        list.add(sum);

        return list;
    }
}
