package day58;

public class TryCatchFinally {

    public static void main(String[] args) {//throws Exception {
        System.out.println("Before try catch ");
        try {
            System.out.println("hello from try block"); // this line runs
            String str = null;
            System.out.println(str.length()); // -- null pointer exception : if NO try and catch
            // System.out.println("hello from try block"); -- this line will not run if it si after str.length()
        } catch (Exception e) {
            System.out.println("exception happened and caught "); // if above TRY BLOCK has NO exeption this line does not execute!!
        } finally {
            System.out.println("finally block . runs even if there is exception or no excepction");
        }


        // System.out.println("After try catch");
        // try {
        //    int x = "string"; // this is not exeption ! or it would have been caught

//        } catch (Exception e) {
//            System.out.println("we handled ");
//        }
    }
}

