package repl;

public class Repl71 {
    public static void main(String[] args) {

        // first solution

//        for (int x=2; x <=100;x++ ) {
//            if (x%2==0) {
//                System.out.print(x+",");
//            }
//        }

        //second solution
        int x = 2;
        while (x <= 100) {

            if (x != 100){
                System.out.print(x+",");
            } else {
                System.out.print(x);
            }
            x+=2;
        }





    }
}
