package day28;

import java.util.Arrays;

public class ExcelVisualizer {
    public static void main(String[] args) {
        /*

Cell(1,1)= 78    Cell(1,2)= 54    Cell(1,3)= 100    Cell(1,4)= 84
Cell(2,1)= 33    Cell(2,2)= 44    Cell(2,3)= 77    Cell(2,4)= 123
Cell(3,1)= 12    Cell(3,2)= 88    Cell(3,3)= 52    Cell(3,4)= 76
Cell(4,1)= 67    Cell(4,2)= 33    Cell(4,3)= 98    Cell(4,4)= 67
Cell(5,1)= 12    Cell(5,2)= 88    Cell(5,3)= 52    Cell(5,4)= 45
Cell(6,1)= 67    Cell(6,2)= 33    Cell(6,3)= 98    Cell(6,4)= 34

         */

        int [] row1 = new int [] {78,54,100,84};
        int [] row2 = new int [] {33,44,77,123};
        int [] row3 = new int [] {12,88,52,76};
        int [] row4 = new int [] {67,33,98,67};
        int [] row5 = new int [] {12,88,52,45};
        int [] row6 = new int [] {67,33,98,34};

        //to store this in another array object

        int [][] sheet =  new int [][] {row1,row2,row3,row4,row5,row6};

        // index  of 2D         0       1               2 = what is the first Item in this 2d
        int [][] sheet1 = { {10,27 }, {87,99,100 }, {90,100 } };
        // index for 1D      0  1       0  1  2       0  1

        //print 100
        System.out.println(sheet1[1][2]);

        //print90
        System.out.println(sheet1[2][0]);

        //if we dont know which index:
        //we loop inside each and every number

        System.out.println(sheet1.length); // 3
        //how many item i have in first item of this 2d array
        System.out.println(Arrays.toString(sheet1[0])); // seeing what is inside first 1D array
        System.out.println(sheet1[0].length);//getting the length of first 1D array
        System.out.println(sheet1[1].length); // getting the length of second 1D
        System.out.println(sheet1[2].length); // getting the length of third 1D

        //how can i make above code better?
        //by loop !

        for (int i = 0; i <sheet1.length ; i++) {
            System.out.println("item number "+ (i+1)+ " length is : "+ sheet1[i].length);

        }

        //loop below is printing items inside of 2D loop

        for (int i = 0; i < sheet1.length ; i++) {
            for (int j = 0; j < sheet1[i].length; j++) {
                System.out.print(sheet1[i][j]+" ");
            }

        }

//        String []town = { "Boston", "Waltham"};
//        int [] population = {30000, 456000};
//
//        String [][] allTogether = {town,population}; // this cannot happen!! need to ask Akbar
















    }
}
