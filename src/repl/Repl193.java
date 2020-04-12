package repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl193 {

    public static void main(String[] args) {
        //combining two arrays into one arraylist
        //and print out as String


        String[] r1 = {"Sofiya", "Mervin"};
        String[] r2 = {"Mervin", "Begli"};

        System.out.println(combineRs(r1,r2));


    }

    public static String combineRs(String[] r1, String[] r2) {

        ArrayList<String> combined = new ArrayList<>();
        //  List<String> combined = new ArrayList<>(Arrays.asList(r1)); this is how Serdar added
        combined.addAll(Arrays.asList(r1));
        combined.addAll(Arrays.asList(r2));

        String result = "";
        for (String each : combined) {
            result+= each;
        }
        return result;
    }

}
