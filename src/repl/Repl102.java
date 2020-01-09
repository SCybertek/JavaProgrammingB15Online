package repl;

import java.util.Scanner;

public class Repl102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

       if (html.contains("<html>")) {
            System.out.println(html.substring(html.indexOf("id=")+2 , html.lastIndexOf(">")-1));
       } else {
            System.out.println("Invalid input!");
            //??????//
        }
    }
}
