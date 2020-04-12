package repl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Repl157 {
    public static void main(String[] args) {

        //valueOf method convert String to integer ,
        // parseInt basically can convert String to either integer or int

        // does NOT WORK :((((( WHY?


        String abc = "07:05:45PM";
//        String[] abcAfter = abc.split(":");
//        System.out.println(" after split " + Arrays.toString(abcAfter));
//
//        //now after split we convert from String to Interger
//        int hour = Integer.parseInt(abcAfter[0]);
//        System.out.println("hour = " + hour);
//
//        int second = Integer.parseInt(abcAfter[2].substring(0, 2));
//        System.out.println("second = " + second); /// this line is not working /.. but why?
        timeConversion(abc);

    }

    public static void timeConversion(String s) {

        String[] time = s.split(":");
        int t=0;
        if(s.contains("PM")){
            t=Integer.parseInt(time[0])+12;
            System.out.println(t+s.substring(s.indexOf(":"),s.length()-2));

        }else{
            System.out.println(s.substring(0,s.length()-2));
        }
//        String[] sSplitted = s.split(":");
//        int hour = Integer.parseInt(sSplitted[0]);
//        int minute = Integer.parseInt(sSplitted[1]);
//        String second = sSplitted[2].substring(0, 2);
//
//        if (sSplitted[2].contains("PM")) {
//
//            System.out.println((hour + 12) + ":" + minute + ":" + second);
//
//        } else {
//            System.out.println(hour + ":" + minute + ":" + second);
//        }
    }



}
