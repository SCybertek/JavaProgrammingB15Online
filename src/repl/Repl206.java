package repl;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Repl206 {
    public static void main(String[] args) {
        ArrayList<Boolean> lst = new ArrayList<>(Arrays.asList(true, false, false));
        repeatAl(lst);
    }
    public static void repeatAl (ArrayList<Boolean> list) {

        list.addAll(list);
        System.out.println("list = " + list);

    }

}
