package repl;

public class Repl168 {
    public static void main(String[] args) {


        System.out.println();


    }

        public double waterTax(double units) {
            double bill = 0.0;

            //your code here

            if ( units < 50 ) {
                bill = units * 0.6 ;
                return bill;
            } else if ( (units > 50) && (units < 100) ) {
                bill = units * 0.9 ;
                return bill ;
            } else if ( ( units > 100) && ( units < 150) ) {
                bill = units * 0.9 + 50;
                return bill;
            } else {
                bill = units * 0.9 + 100 ;
                return bill;
            }


        }
}
