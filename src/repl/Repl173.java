package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl173 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows


        //TODO write your code below
        // to find a biggest number in an array we should 
        //take one number from the array compare with rest 
        
        int biggestNumber = arr[0][0];
        
        for (int i = 0; i < rows ; i++) {
           // System.out.println("doing for row " + i );
            for (int j = 0; j < cols ; j++) {
               // System.out.println("doing for column " + j);
                if (biggestNumber < arr[i][j]) {
                    biggestNumber = arr[i][j];
                }
            }
            
        }
       // System.out.println("biggestNumber = " + biggestNumber);


        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
               arr[i][j] = biggestNumber;
                }
            }




        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));
    }
}
