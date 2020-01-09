package thanksgivingTasks;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Ask user to enter full name
assuming full name is 2 word
Write a program generate email account as below:
it starts with first character of first name
and whole last name then @NightWatch.com
for example :
Jon Snow -->> JSnow@NightWatch.com
         */
        System.out.println("Enter your full name please");
        String name = scan.nextLine();

        char nameFirstWord = name.charAt(0);
        int lastNameStarting = name.indexOf(" ")+1;
        int endingName = name.length();

        System.out.println(nameFirstWord+name.substring(lastNameStarting,endingName)+"@NightWatch.com");

    }
}
