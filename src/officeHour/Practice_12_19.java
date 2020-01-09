package officeHour;

import java.util.Arrays;

public class Practice_12_19 {
    public static void main(String[] args) {

        int[] arr = { 10, (byte)9, (short)8, 'a'};
        // data must match datay type of an array
        System.out.println(Arrays.toString(arr));  // [10, 9, 8, 97]

        //when you convert  byte to an int then it is implicit casting
        //when you convert short to an int then it is implicit casting

        long l1= 100;
        //implicit casting because by defaul 100 is an integer , and we assigned it to a long

        int num1 = (int)l1; // this give compile error because Long > int
        //here we have explicit casting, which is not done automatically
        // int num1 = (int)l1 --> this is explicit casting

        System.out.println(arr[arr.length-1]);

        int [] arr2 = {0,0,0};
        for (long each : arr2) {
            System.out.println(each);
        }


        //WHEN do we need For each loop
        //when we dont need index of elements

        System.out.println("========================");

        for (int i = 0; i <=4 ; i++) {
            System.out.println(i);
            if (i==2) {
                continue;
            }
            System.out.println(i + " is printed");
        }

        System.out.println("========================");
        for (int i = 0; i <=4 ; i++) {
           // System.out.println(i);
            if (i==2) {
                break;}
            System.out.println(i + " is printed");
        }




    }
}
