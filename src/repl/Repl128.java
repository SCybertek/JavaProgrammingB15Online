package repl;

public class Repl128 {
    public static void main(String[] args) {

        double [] temps = { 80, 88, 88, 84, 82, 78, 60, 68} ;

        double averageTemp = 0 ;

        // to find average is sum of allelements and divide by size array
        //lets loop

        double total = 0 ;
        int k = 0 ;

        for (int i = 0; i < temps.length; i++) {
            total += temps[i] ;
        }
        averageTemp=total/temps.length;

        System.out.println(averageTemp);


    }
}
