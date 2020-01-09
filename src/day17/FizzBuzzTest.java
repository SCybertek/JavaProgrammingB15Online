package day17;

public class FizzBuzzTest {
    public static void main(String[] args) {
        //if COPY PASTE

        //    int num = 15;


//        }
        int num = 1;
        while (num <= 100) {
            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println(num + " is Fizz Buzz number");
            } else if (num % 5 == 0) {
                System.out.println(num + " is Fizz number");
            } else if (num % 3 == 0) {
                System.out.println(num + " is Buzz number");

            }
                ++num;

        }
    }
}
