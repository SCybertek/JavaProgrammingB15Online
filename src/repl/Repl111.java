package repl;

public class Repl111 {
    public static void main(String[] args) {

        int k = 1;
        int total = 0;

        //logic:
        //

        do {
            k = k*k;
            total = total + k ;
            k++;
        } while ( k <=3);


        System.out.println(total);
    }

}
