package repl;

import java.util.Scanner;

public class Repl142 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below
        int biggestNum = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ( biggestNum < arr[i][j]) {
                    biggestNum = arr[i][j];
                }
            }
        }
        System.out.println(biggestNum);


    }
}
