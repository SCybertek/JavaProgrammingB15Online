package repl;

import java.util.ArrayList;

public class Repl216 {
    public static void main(String[] args) {


    }


    public String blogDb(ArrayList<String[]> r, String id) {

        //logic :
        // take arraylist and loop through it.. check if it has the matchfor id

        for (int i = 0; i < r.size(); i++) {
            //for ( int j = 0 ; j < r.get(i).length ; j++ ) {
            if (r.get(i)[0].equals(id))
                return r.get(i)[1] + "\n" + r.get(i)[2];

        }
        return "";
    }
}
