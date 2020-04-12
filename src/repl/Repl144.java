package repl;

import java.util.Scanner;

public class Repl144 {
    public static void main(String[] args) {
        //You get a 2d array and you need to find how many two matches there are.
        //and return the number(int) of matches you found.

        Scanner inp = new Scanner(System.in);
        //int rows = inp.nextInt(), cols = inp.nextInt();

        int[][] arr = { {3,3,2,2,1 },{1,3,3,7,8,8} };
        //{{2, 2,1,3,4,}, {5,2,3,3,4,5}, {3,2,3,1,4,5}};

//                new int[rows][cols];
//        for (int i = 0; i <= rows - 1; i++) {
//            for (int j = 0; j <= cols - 1; j++) {
//                arr[i][j] = inp.nextInt();
//            }//end for cols
//        }//end for rwos

        //your code here

        int matches = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) { // here we add -1 because we are adding +1 in condition
              if (arr[i][j] == arr[i][j + 1]) {
                    matches++;

                }
            }
        }

            System.out.print("matches: " + matches);

        }
    }


    //Serdars code:
//int matches = 0;
//        for (int i = 0; i <= rows - 1; i++) {
//            for (int j = 0; j <= cols - 2; j++) {
//                if (arr[i][j] == arr[i][j + 1]) {
//                    matches++;
//                }
//            }
//        }

