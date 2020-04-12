package repl;

public class Repl162 {

    public static void main(String[] args) {
        int num = 5;
        fib(num);

    }

    public static void fib(int num) {
        //WRITE YOUR CODE HERE

        //logic: user will input number
        //that input will be an index number of fibionacci = output should be the number at that index

        int first = 0;
        int second =1;
        int sum=0;
        for (int i = 1; i <=num ; i++) {

            sum=first+second;
            second=first;
            first=sum;

        }
        System.out.println(sum);



    }
}
