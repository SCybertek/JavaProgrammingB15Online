package day34;

public class MathActionFromJDK {
    public static void main(String[] args) {

        //where is String class coming from
        // why we import Scanner but do not import String class
        //it is a special package that called java.lang
        // any class in it does not need importing when being used
        //for example String Class

        //what if I really want to explicitly import string class
        //import java,util.String

        String str = "Hello";

        // There is a class under java.lang called Math
        // and it has lots of math utility methods that ready to be used

        int sum = Math.addExact(10, 20);
        System.out.println("sum = " + sum);

        System.out.println("max of 10, 20 --> " + Math.max(10, 20));





    }
}
