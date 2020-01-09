package day18;

public class DoWhileLoop {
    public static void main(String[] args) {


        //count from 1 to 5;

        // {} curly braces
        // [] square bracket
        // () parenthesis
        // | pipe
        // & ampersand
        // \ backslash
        // / forward slash
        //


      //  do {
      //      take some action here and repeat it
      //  } while (some condition is true);

      int x= 1;

      do {
          System.out.println(x);
          ++x;

      }while (x<=5); // ends with ; very important

        //count from 5 to 1 :
         int y = 5;

         do {
             System.out.println(y);
             --y;

         } while (y>0) ;

// while loop checks the condition first then enters the statement
        //do while loop while take the action at least once then ckeck the condition

        // DO WHILE always run at least ONE iteration !!
        //WHILE loop might not even run !!





    }
}
