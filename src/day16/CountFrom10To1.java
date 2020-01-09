package day16;

public class CountFrom10To1 {
    public static void main(String[] args) {
        //I want to start with 10, then decrease the variable
        //so, I can get out of the loop

        int count =10;
        while (count>=1) {
            System.out.println(count);
            --count;
        }

        System.out.println("final value of count "+ count);
           // (00.0------------------------++++++ ++++++++++++++++++++++++++++
            //+++++++++-------------)        }
    }
}
