package day58;

public class RunTimeError {

    //thrawable --- error class:
    //checked exceptions occurs when it compiles. Unchecked occurs when you run them ??

    //,ost popular errors
    //StackOverflow --  if stack is full

    //OutOfMemoryError -- if heap is full


    //static var:

    static int num = 0;

    public static void main(String[] args) {

        num++;
        System.out.println("num = " + num);

        main(null); // strangely no error appeared for me .. but it is StackOverFlow error
        //whenever method is called in Java a frame is placed in Stack memory for that method call.If method calls itself recursively ,
        // another frame is placed on existing frame
        //If it keeps continuing
        //Stakc will be evntually full and StackOverFlow will appear
        //stack memory can be xtended manually


    }
}
