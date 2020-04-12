package day59;

import java.io.IOException;

public class CheckedAndUnchecked2 {

    public static void main(String[] args) throws InterruptedException {//} throws IOException {
            // throws is like a box with HANDLE with care sign on it - warning! no exception yet
        // throw is actually throwing the exception

        // checked exception must be handled or declared

        // handle -->> try catch
        // declare -->> add it to the method signature to document


            String x = "abc";
            System.out.println("START");
//        try {

//            throw new IOException("just throwing this away");
            Thread.sleep(3000); // it throws interrupted exception! it ic checked one!


            System.out.println("End");

//        } catch (IOException e) {
//            System.out.println("Exception caught");
//        }

        }
}
