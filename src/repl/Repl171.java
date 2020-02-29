package repl;

import java.util.Arrays;

public class Repl171 {
    public static void main(String[] args) {
        //NOTES: how to see matrix: and add elements :

        //int[][] arr = new int[rows][cols];
        //    for(int i=0 ;i<=rows-1;i++)
        //    {
        //      for(int j=0 ;j<=cols-1;j++)
        //      {
        //        arr[i][j]=inp.nextInt();
        //      }//end for cols
        //    }//end for rwos



        //chessboard :
        // first element [0][0] = 1a
        //last isi [7 [7] = 8h
        String[][] chessBoard = new String[8][8];
        //raw : []
        //column : [] []

        String [] row = { "1","2","3","4","5","6","7","8"};
        String [] column = {"a","b","c","d","e","f","g","h"} ;

        for (int i = 0; i < 8 ; i++) {
            //chessBoard[i] = row[0];
            char letter = 'a';
            for (int j = 0; j < 8 ; j++) {
                    chessBoard[i][j] = "" + (i+1) + letter;
                    letter++;
            }
        }

        System.out.println(Arrays.deepToString(chessBoard) );





            }
        }


