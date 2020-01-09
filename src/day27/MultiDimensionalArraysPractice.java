package day27;
import java.util.Arrays;

public class MultiDimensionalArraysPractice {
    public static void main(String[] args) {

       // N dimensional Array MUST contain (N-1) dimensional array
        // 2 dimensional array
        String [][] names = {{"Rukshona", "Ghoya"} , {"Hasan", "Tetiana"} };

        //print hasan

        System.out.println(names[1][0]);

        //print tetiana
        System.out.println(names[1][1]);

        //change value:
        names[1][1] = "Dilshat";
        System.out.println(names[1][1]);

        //print hasan and dilshat
       // System.out.println(names[1]); // [Ljava.lang.String;@38af3868

        // in order to print oit single dimentioknal array we have to use toString method
        System.out.println(Arrays.toString(names[1]));

        //in order to print multi dimensional array we have to cnvert this to string using deepToString
        System.out.println(Arrays.deepToString(names));
        System.out.println("=============================");

        int [] [] numbers = { {1,2,3} , {4,5,6} , {7,8,9}, {10,11,12,13,14}};
        //                      0,          1,      2

        //to print out an array YOu have to CONVERT To string!

        System.out.println(Arrays.toString(numbers[1]));

        for (int i = 0; i < numbers.length ; i++) { //checks each index of 2 dimensional array
           // System.out.println(Arrays.toString(numbers[i]));
            for(int j=0;j<numbers[i].length ; j++) { // we give here i because i represents arrays numbers we have in this multidimensional array
                System.out.print(numbers[i][j]+" ");
            }

        }

        System.out.println("\n=======================================");
        int[][] ages = { {10}, {12,13,14,16,17}, {19,20,21,22,23}};

        //task: use nested loop and print even numbers separated by a space

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length ; j++) {
                if (ages[i][j] %2==1){
                    continue; // skipping odd numbers to print even numbers ONLY
                    // to do without continue:
                    //          if (ages[i][j] %2==0){
                    //          sout (ages[i][j]+ " ")
                } else {
                    System.out.print(ages[i][j]+" ");
                }

            }

        }

        System.out.println("\n ====================================");

        int[] arr1D = {1,2,3};
        for (int each  : arr1D) {
            System.out.print(each+" ");
        }

        System.out.println("\n =====================================");
        int [][] arr2D = { {10,20,30}, {40,50,60,70,80,90,100}};

        for (int[] each1DArray: arr2D){ // variable name each1DArray represents each index of the 2D array
            for (int eachElement : each1DArray) { // variable name eachElement represents each element
                System.out.print(eachElement+ " ");

            }
           // System.out.print(Arrays.toString(each1DArray)); // beyle bolmali
            //System.out.print(each1DArray); // seyle bolanok !!! garip seyler cikiyor
        }





    }
}
