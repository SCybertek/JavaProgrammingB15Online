package day21;

public class LoopControlStatement {

    public static void main(String[] args) {

        //break
        //if line contain break. the loop will stop at that point

        //continue
        //if line contains continue. the loop will skip iteration

        //we CAN use continue and break in ANY LOOP

        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
            break; // it printed only number 1

        }
        // while iteration 1-10
        //break the loop when it is 5

        for (int i = 1; i <=10; i++) {
            System.out.println(i);
            if (i==5){
                break;
            }
        }
//        int sum= 0;
//
//        for (int i = 1; i <=10 ; i++) {
//            sum =sum +i;
//
//        }
//
//        System.out.println(sum);

        int sum = 0;

        for (int x = 1; x <= 10; x++) {

            System.out.println("current sum is " + sum);
            System.out.println("If I had "+ x+ "dollars , it would be "+ (sum+x));



            if (sum + x > 30) {
                break;
            }
            // we need to add the sum after we make sure it did not go over 40
            sum = sum + x;

        }
        System.out.println("sum = " + sum);




    }
}
