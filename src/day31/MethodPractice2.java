package day31;

public class MethodPractice2 {

    public static void main(String[] args) {
        //write piece of reusable code to count from 1 to 10
        //give a name count1to10                                : method name
        // no need for object when being called                 : static
        // it should be accessible anywhere in your project     : public
        //it does not return any value                          : void
        //does not need any extrrnal date                       : (nothing is here)

        cound1to10();
       // System.out.println(); -to separate
        cound1to10();
        MethodPractice2.cound1to10();

    }


        public static void cound1to10 (){
            for (int i = 0; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }

