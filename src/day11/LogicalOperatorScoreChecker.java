package day11;

public class LogicalOperatorScoreChecker {

    public static void main(String[] args) {
        int score = 13;

        // score = 10000
        // ( score>70 || score<100) : in this case it will be TRUE, whcih is logically does not make sence


        if (score< 0 || score> 100) {
            System.out.println("Invalid score");
        } else if (score==100) {
            System.out.println("Perfect score");
        } else if ( score>70 && score<100) {
            System.out.println("You have passed ");
      //  } else if (score <20) {
        //    System.out.println("Come to my class");
                                    // these are logically wrong
      //  } else if (score >30 && score<40) {
       //     System.out.println("Attend additional classes");
      //  } else if (score>40 && score<70) {
      //      System.out.println("Little bit more study will let you pass");
        } else {
            System.out.println("You have failed!");
        }
    }
}
