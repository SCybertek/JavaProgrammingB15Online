package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversingLIst {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>(Arrays.asList("Sofiya", "Begli", "Mervin", "Miles")) ;
        lst.add("Babushka");
        System.out.println("lst = " + lst);
        // List<String> topics = Arrays.asList("Java","Selenium","Database","API") ;

        //lets reverse it :

        for (int i = lst.size()-1 ; i >= 0 ; i--) {
            System.out.println("reversed lst = " + lst.get(i) );
        }


        List<Integer> nums = Arrays.asList(5,6,7);//new ArrayList<>(Arrays.asList(6,7,8));
//        nums.add(2);
//        nums.add(3);--.UnsupportedOperationException
//        nums.add(4);
        System.out.println("nums = " + nums);

    }
}
