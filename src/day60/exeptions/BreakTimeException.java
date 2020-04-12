package day60.exeptions;

public class BreakTimeException extends RuntimeException {


}
class Main {


    public static void main(String[] args) {

        //throw new BreakTimeException();
        // why? it is all about having domain specific language
        //i want to be able to say something about my application
        // example if we have a calculator: DoNotDivideByZeroException
        //gives us power to have something specific rather than generic once

        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("VIOLA MY OWN THING CAUGHT");
        }
    }
    }
