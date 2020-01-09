package day16;

public class WhileLoopPractice {

    public static void main(String[] args) {
        int x = 100;

        while (x<=105) {

            System.out.println("hello world");
            x++;  //will increase the value by 1 next time
            //++x ; it will increase the value by 1right now

        }

        /*
        iteration 1 x =100
        number is 100 and it meets condition
        x<=105;
        "hello world" x=101

        iteration 2 x=101
        number is 101 and it meets condition
        x<=105;
        "hello world" x=102

        iteration 3 x=102
        number is 102 and it meets condition
        x<=106;
        "hello world"

        iteration 4
        number is 103 and it meets condition
        x<=106;
        "hello world"

             iteration 5
        number is 104 and it meets condition
        x<=106;
        "hello world"

             iteration 6
        number is 105 and it meets condition
        x<=106;
        "hello world" x=106

             iteration 7
        number is 107 and it DOES NOT meets condition
        x<=106;
        GET OUT OF THE LOOP


         */

    }
}
