package day17;

public class WhileLoopPractice<counter> {

    public static void main(String[] args) {
        //count 1 to 5
        //then 5 to 1

        //iteration 1: count is 1..1<=5..TRUE..COUNT printed as 1 and it is increased to 2
        //iteration 2: count is 2..2<=5..TRUE..COUNT printed as 2 and it is increased to 3
        //iteration 3: count is 3..3<=5..TRUE..COUNT printed as 3 and it is increased to 4
        //iteration 4: count is 4..4<=5..TRUE..COUNT printed as 4 and it is increased to 5
        //iteration 5: count is 5..5<=5..TRUE..COUNT printed as 5 and it is increased to 6
        //iteration 6: count is 6..6<=5..FALSE.. LOOP FINISHED!

        int counter = 1;

        while (counter<=5 ) {
            System.out.print(counter + " ");
            ++ counter;
        }
        System.out.println();
        System.out.println("counter after increment = "+ counter);

        //now I want ot count down from 5 to 1
        //using the same counter

        while (counter>1) {
            --counter; //we put this before our println just to make our starting counter 5 , not 6
            System.out.print(counter+ " "); // you can also , sout (--counter + " ");
        } // this loop prints 5 4 3 2 1 0
        // because 6>=1 5>=1 4>=1 3>=1 2>=1 1>=1  true 0>=1 False

        //so we need to change condition into counter >1 , then it becomes 1>1 false and 0 is not printed in console
        System.out.println();
        System.out.println("counter after decrement " + counter);

    }
}
