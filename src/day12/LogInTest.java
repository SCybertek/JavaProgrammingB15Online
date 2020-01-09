package day12;

public class LogInTest {
    public static void main(String[] args) {

        // to declare two string in one shot
        // String userName="abc", password="efg";

        String userName = "user123";
        String password = "pass123";
        if (userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Login successful");
        } else if (!userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Username is not correct");
        } else if (userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Password is not correct");
        } else {
            System.out.println("Both password and login are not correct");
        }
        System.out.println(!userName.equals("user123"));
    }
}
