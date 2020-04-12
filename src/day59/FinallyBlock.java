package day59;

public class FinallyBlock {
    public static void main(String[] args) {

        //in some cases we want to run certain code
        //no matter exception happen or not
        //as part of try catch

        int [] nums = {1,4,6};

        try {
            //System.out.println("nums[5] = " + nums[5]); //ARRAYSINDEXOUTOFBOUND exception
            //what is happened in here? behind scene this happens:
            throw new ArrayIndexOutOfBoundsException("Index 5 out of bounds for length 3"); // line 13 and 15 are the same
            //the objcet is created out of this Exceptions(ArrayIndexOutOfBoundException) class
        } catch (Exception e) {
            //how do I get the message out of the exception object
            //Any exception object (can) have message field
            //and it can be extracted by calling getMessage method
            //we can also create our own exception object and we will learn how to override .getMessage (with our own message)
            System.out.println("Exception caught \n" + e.getMessage());
        } finally {
            System.out.println("THIS CODE WILL ALWAYS RUN NO MATTER WE HAVE EXCEPTION OR NOT");
            //finally in real world : it is used to close the connection that we opened in somewhere
            //for example: in data base connection: you open the connection take a data and close connection
            // (will be covered later)

            //here we are learning that finally code will run no matter we have exception or not!
            //difference between final and finally:
            //final is where we cannot override- it can be class , variable or method
            //finally is this finally from try and catch block
        }

        System.out.println("THE END");
    }
}
