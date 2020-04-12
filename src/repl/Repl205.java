package repl;

import java.util.Arrays;

public class Repl205 {
    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] newArr = new int[5];
//        newArr[0] = ints1[0] + ints2[0];
//        newArr[1] = ints1[1] + ints2[1];
//        newArr[2] = ints1[2] + ints2[2];
//        newArr[3] = ints1[3] + ints2[3];
//        newArr[4] = ints1[4] + ints2[4];
        for (int i = 0; i < newArr.length ; i++) {
            newArr[i] = ints1[i] +ints2[i];
        }
        return newArr;

    }
    //second way lets try loop

}
