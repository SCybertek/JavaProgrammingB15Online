package repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Repl214and215 {

    public static String search(ArrayList<String> r, String find)
    {
        //with forEach loop: checing if ArrayList contains find : if yes print the whole element
        for ( String each : r) {
            if (each.contains(find) ) {
                return each;
            }


        }
        return "search failed";

    }//end wineSeller

    public static String searchFor(ArrayList<String> r, String find)
    {
        //with for loop: checing if ArrayList contains find : if yes print the whole element
        for (int i = 0; i < r.size(); i++) {
            if ( r.get(i).contains(find)) {
                return r.get(i);
            }
        }
    return "search failed";
    }//end wineSeller

    public static ArrayList<Integer> twoTimes (ArrayList<Integer> abc ) {

        ArrayList<Integer> abcNew = new ArrayList<>();
        abcNew.addAll(abc);
        for (int x = 0 ; x < abcNew.size() ; x+=2 ) {
            abcNew.add ( x, abcNew.get(x) ) ;
        }
        return abcNew ;

        //below I added without creating a new ListArray and sorted. However requirements clearly said to create
        // a new ArrayList and just add without sorting
//        abc.addAll(abc);
//        Collections.sort(abc) ;
//        return abc;
    }

    public static void main(String[] args) {

        ArrayList<Integer> bla = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(twoTimes(bla) );
    }

}
