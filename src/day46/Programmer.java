package day46;

//Programmer as super class
//JavaProgrammer SQLProgrammer
//please override code and test under Sub classes

public class Programmer {

     void code () {

        System.out.println("any programmer code");
    }
// Private method is not inherited and cannot be overridden
    void test () {
        System.out.println("any programmer test");
    }

}
