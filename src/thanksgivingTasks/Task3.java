package thanksgivingTasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Ask user to enter full name
assuming full name is 2 word
Write a program to print users initials
for example :
Jon Snow -->> Initial is JS
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = scan.nextLine();

       // System.out.println(name.lastIndexOf(""));
       // int lastName = scan.indexOf(" ")+ 1;

        int secondWord = name.indexOf(" ")+1;
       // System.out.println(secondWord);

        System.out.println(name.charAt(0) + name.substring(secondWord,secondWord+1));


//        int startingPoint = movie.indexOf(" ")+ 1;
//        int endingPoint = movie.length();
//
//        System.out.println("second word till last : "+ movie.substring(startingPoint, endingPoint));
    }
}
