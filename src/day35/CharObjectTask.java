package day35;

import day23.ForeachLoopIntro;

public class CharObjectTask {
    public static void main(String[] args) {

//        haracter charObject = Character.valueOf('a');
//        System.out.println("Get Character Object-> Character.valueOf('a') = " + Character.valueOf('a') );
//        System.out.println("Character.isDigit('7') = "      + Character.isDigit('7'));
//        System.out.println("Character.isLetter('A') = "     + Character.isLetter('A'));
//        System.out.println("Character.isLetterOrDigit(' ') = " + Character.isLetterOrDigit(' '));
//        System.out.println("Character.isUpperCase('a') = "  + Character.isUpperCase('a'));
//        System.out.println("Character.isLowerCase('b') = "  + Character.isLowerCase('b'));
//        System.out.println("Character.toUpperCase('a') = "  + Character.toUpperCase('a'));
//        System.out.println("Character.toLowerCase('A') = "  + Character.toLowerCase('A'));

//        // "A123b3W423cc4523B $$ aa 77J JsG8 2347SDFSJF"
//        Try out above Character methods given to you and try to solve the problem of extracting the number out of the string

// DID nOT DO THE TASK
        /**
         *
         */

        Float f1 = new Float(3.14);
        Float f2 = new Float("3.14");

        //above way is deprecated (OLD, NOT RECOMMENDED)
        Float f3 = Float.valueOf(3.14f); // it is static method

        // how do you know? because it goes ClassName.methodName
        Float f4 = Float.valueOf("3.14");

        //or we can just let java autobox our float value into float object
        Float f5 = 3.14f;

        //how can we turn String value into float value

        //"3.14"--> 3.14f
        Float x = Float.parseFloat("3.14");





    }
}
