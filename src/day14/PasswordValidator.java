package day14;

public class PasswordValidator {
    public static void main(String[] args) {
        // password validator
        //minimum 8 char max 16 char
        //must contain _ or $
        //it must not contain space
        // it must start with Ab

        // if any of above condition does not match say INVALID password
        //else say GOOD PASSWORD!

        String password = "AbH$73_gfgdsu";

        //minimum 8 char max 17 char
         boolean min8max16 = password.length()>= 8 && password.length() <=16 ;


        //must contain _ or $
        boolean mustContain_or$ = password.contains("_") || password.contains("$");

        //it must not contain space
        boolean mustNotContainSpace = !password.contains(" ");

        //it must start Ab
        boolean mustStartWithAb = password.startsWith("Ab");

        if (min8max16 && mustContain_or$ && mustNotContainSpace && mustStartWithAb) {

            System.out.println("Valid Password");
        } else
        {
            System.out.println("Invalid Password");
        }

    }
}
