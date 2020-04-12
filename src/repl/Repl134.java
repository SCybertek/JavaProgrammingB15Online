package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl134 {
    public static void main(String[] args) {


//        Scanner scan = new Scanner(System.in);
//        int sizeInner = scan.nextInt();
//        int sizeOuter = scan.nextInt();
        int[] inner = {7,1,3, 4};

        // new int[sizeInner];
        int[] outer = {1, 2, 4, 6};
//                new int[sizeOuter];
//        for(int i =0; i < sizeInner; i++) {
//            inner[i] = scan.nextInt();
//        }
//        for(int j =0; j < sizeOuter; j++) {
//            outer[j] = scan.nextInt();
//        }
        Arrays.sort(inner);
        Arrays.sort(outer);

       // to check if outter array contains inner array we could do a loop

        boolean exists = false;

       for ( int each : inner) { // 2

           exists = false; // this is important to have here to make sure that EVERY SINGLE element in inner is existing in outer

           for (int eachInside : outer) { // 1

               if (eachInside == each) {
                   exists = true;
               }
           }

               if (exists == false) { // this is needed to get out of the loop when num si not there
                   break;
               }

           }



        System.out.println(exists);

    }
}
