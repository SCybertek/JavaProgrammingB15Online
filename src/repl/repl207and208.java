package repl;

import java.util.Arrays;

public class repl207and208 {

    public static int[] do_switch(int[] i)
    {
// to switch an array element we can do it by using loop and in here regular index assignment I suppose
        int temp = i[0];
        i[0] = i[i.length -1];
        i[i.length -1] = temp ;

        return i ;

    }

    public static int[] populate(int[] r)
    {
        for ( int x = 0 ; x < r.length ; x ++) {
            r[x] = x + 1;
        }
        return r ;

    }

    public static void main(String[] args)
    {


        int [] i= new int[3];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));

    }


}
