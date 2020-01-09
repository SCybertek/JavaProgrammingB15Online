package day14;

public class EmailChecker {
    public static void main(String[] args) {
        //check for followings
        // create variable called email
        // if it does not contain character @ say invalid
        //if it contains space say invalid
        //if it ends with @gmail.com -- gmail
        // if it ends with @mail.com -- russian email
        //if it ends with @yahoo.com -- yahoo email

        String email = "sofiya@gmail.com ";
        if (!email.contains("@") || email.contains(" ")) {
            //either of these two are not correct we do not need both conditions to be met
            // thats why it is || not &&
            System.out.println("Invalid email ");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("gmail");
        } else if (email.endsWith("@yahoo.com")) {
            System.out.println("yahoo email");
        } else if (email.endsWith("@mail.ru")) {
            System.out.println("russian email");
        } else {
            System.out.println("this is not valid email ");
        }

    }
}
