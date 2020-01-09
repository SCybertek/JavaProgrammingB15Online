package repl;

public class Repl123 {
    public static void main(String[] args) {
        //he Utopian Tree grows exactly 1 cm for the first three years,
        // and after that it grows by 2 cm every year. You will need to use loops to create it.
        //Show 10 years of growth of the Utopian Tree.


        int treeSize = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.println("year "+ i + " - " + "growth " + 1 + " cm" );
            treeSize= i;
            System.out.println("tree size: " + treeSize + "cm");
        }

        for (int j = 4; j <= 10; j++) {

            System.out.println("year "+ j + " - " + "growth " + 2 + " cm" );
            treeSize = treeSize + 2 ;
            System.out.println("tree size: " + treeSize + "cm");
        }


    }
}

