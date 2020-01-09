package day34;

public class LoginMethod {
    public static void main(String[] args) {
//        login1 :  static void method
//        it has two String method paramters
//        called username and password
//        (it accept 2 String object as argument when being called)
//        it check whther username and password  "user" and "abc123"
//        if yes
//        print login successful
//	        else
//        print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)
        login1("user","abc123");
        login1("abc", "user");
       // System.out.println(login1("abc", "user")); // this will not work!! because it is VOID
        //same with here
        //boolean resul2 = login1("abc", "asd"); // this method does not give value
        // you cannot store it in variable


        boolean result = login2("user", "abc123");
        System.out.println("result = " + result);

        System.out.println("second run " + login2("use", "abc"));

        if (login2("user", "abc123")) {
            // unless you login you cannot add to your cart
            System.out.println("add java book to cart ");
            System.out.println("pay for java book in cart");
            System.out.println("view the order ");

        } else {
            System.out.println("no shopping unless you sign in!!!");
            //what can you put insiede if paranthesis !!!!!
//                    1. boolean value
//                    2. boolean variable
//                    3. any boolean expression that generated boolean result
        }


    }




    public static void login1 (String username,String password) {
        if ( username.equalsIgnoreCase("user") && password.equalsIgnoreCase("abc123")) {
            System.out.println("login successful");
        } else {
            System.out.println("login failed");
        }
    }
    
    

    //optional ? why failed




    public static boolean login2 (String username, String password) {

//        if ( username.equalsIgnoreCase("user") && password.equalsIgnoreCase("abc123")) {
//            return true;
//        } else {
//            return false;
//        }

        return username.equals("user") && password.equals("abc123") ; // says true .. but why ?
    }
}
