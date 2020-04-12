package day58;

public class CheckedExceptionDemo {
    public static void main(String[] args) {


        System.out.println("checked exepctoin in next line");

       try {
           Thread.sleep(1000); //this is example for checked exceptinos -- now we need to handel
           //thread.sleep makes stop before running the next line
           //it will not compile bceause of Checked Exception (InterruptedException.)
       }catch (InterruptedException e){

           System.out.println("Exception is caught!"); // this line runs only and only when try block has an error!
       }
        System.out.println("Aftre thread .sleep");

        //Exceptions should be eiter Handled or DECLARED:
        //Handled: using try and catch block .. the code will continue after catching
        //Declared : using throws keyword.. cheaper way :??
    }
}
