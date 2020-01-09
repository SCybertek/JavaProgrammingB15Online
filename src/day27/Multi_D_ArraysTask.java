package day27;

public class Multi_D_ArraysTask {
    public static void main(String[] args) {
        int [] [] numbers = { {12,11,10,19}, {19,20,25}};
        int max = numbers[0][0]; //assume that the first element is the largest

        for (int x= 0; x< numbers.length; x++){ //check each single dimensional array
            for (int i = 0; i < numbers[x].length; i++) {//loop helps us to check each element in the single dimension
                    if (max<numbers[x][i]){
                        max = numbers[x][i];
                    }
            }

        }
        System.out.println(max);


        //solution with for each
        //nested for each loop

        int max2= numbers[0][0];
        for ( int[] each1DArray: numbers){// variable in for each must represent the variable in your array
                                            //each1DArray represent each sing;e dimension array
            for (int eachInt : each1DArray ) {
                if (max2< eachInt) {
                    max2= eachInt;
                }
            }
        }
        System.out.println(max);


        //finding the minimum number:

        int min = numbers[0][0];
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if (min>numbers[i][j]) {
                    min = numbers[i][j];
                }
            }
        }
        System.out.println(min);

        System.out.println("===================================");


    }
}
