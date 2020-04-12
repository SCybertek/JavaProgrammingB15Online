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

        int sum1 = 0 ;
        int sum2 = 0;

        for (int i = 0; i < matrix.length; i++) { //row in the matrix
            for (int j = 0; j < matrix[i].length; j++) { //column in each raw
                if ( i==j ) {
                    sum1 += matrix[i][j];
                }
                if ( i + j == 2) {
                    sum2 += matrix[i][j];
                }
            }
        }


        result = sum1-sum2;




        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
