package day17;



import java.util.Scanner;

public class MyNameInReverseOrder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your name ");

        // print your name backwards assuming ou dont know your character index, lenghts

        // find the last location of your name
        // pick your last character location
        //keep shifting the location to pick until first cahacter

        String name = scan.nextLine();
        int lastCharachterIndex = name.length()-1;

      while (lastCharachterIndex>=0){
          System.out.print("your name backwards : " + lastCharachterIndex + " ");
          System.out.println(name.charAt(lastCharachterIndex));
          --lastCharachterIndex;

      }

      //              01234567 --- index = count -1
      String name2 = "Birnigar";
//                    12345678 ---- name.length()

        //int lastCharacterIndex = name.length () -1 ;
    }
/* HOCANIN YAPTIGI :

Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME !!");
        String name = scan.nextLine();

        //int lastCharacterIndex = name.length()-1 ;
        int x = name.length() - 1;


        while (x >= 0) {

            System.out.println("index " + x + " : " + name.charAt(x));
            --x;
 */





}
