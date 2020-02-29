package repl;

import java.util.Scanner;

public class Repl172 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;

        int a = 0 ;

        for (int i = 0; i < 3; i++) { //row
            for (int j = 0; j < 3; j++) { //column
               // matrix[i][j]
            }
        }
       // System.out.println();

        int num1 = matrix[0][2];
        int num2 = matrix[1][1];
        int num3 = matrix[2][0];

        int b = num1+num2+num3;

        result= a - b ;
//

//        int resul2 = 0;
//
//        for (int i = 0; i < matrix.length ; i++) {
//            for (int j = matrix[i].length; j == 0 ; j--) {
//                 resul2 += matrix[i][j];
//            }
//        }
//        System.out.println(resul2);




        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
