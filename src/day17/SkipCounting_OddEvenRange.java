package day17;

public class SkipCounting_OddEvenRange {
    public static void main(String[] args) {

        //skip counting by 3 from 0 till 30
        // 3 6 12 15 18 21 24 27 30

        int counter = 0 ;

        while (counter<30 ) { // if we have counter <=30 then it will print 33 too
            // counter +=3 ; you can add this separately not inside your print
            System.out.print((counter+=3) + " ");

            // or sout (counter + " ")
            //counter +=3
        }
// write a priogram to print out even number from 0 - 50
        System.out.println();
        int counter2 = 0 ;

        while ( counter2 <=50) {
            System.out.print(counter2 + " ");
            counter2+=2;
        }

        System.out.println("final counter "+ counter2);

        // write a priogram to print out odd number from 0 - 50

        //
        System.out.println("------------");

        int cnt2 = 1;
        while (cnt2 <= 50) {

            System.out.print(cnt2 + " ");
            cnt2 += 2;

        }


        // from 50 to 1 odd is bellow: needs some workkk
        counter2-=2;

        while (counter2>=0) {

            System.out.print(counter2+ " ");
            counter2-=3;
        }
        System.out.println();
        System.out.println("--------------------------");

        int cnt3 =0 ;
        while (cnt3 <=50){

          if (cnt3 %2 ==0 ) {
              System.out.println(cnt3+" is even number");
          } else {
              System.out.println(cnt3 + " is odd number");
          }
          ++cnt3;
        }

    }
}
