package day16;

public class CountTo10_v2 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter<=10) {
            //++ counter -->. cpunter = counter+1
          //  System.out.println(++counter);

            //this starts with 2
            //when we chnage x=0; it will start with 1 and prints 11 times

            // to delete printing 11 times : change condition x<=10 --> x< 10
            System.out.println(counter++);
        }


       // int counter = 0;

        while (counter < 10) {

            // ++ counter -->> counter = counter + 1
            System.out.println(++counter);


        }


//            int counter = 1 ;

//        while ( counter <= 10) {
//
//            // ++ counter -->> counter = counter + 1
//           System.out.println( counter++ );
//
//
//        }

//        int counter = 0 ;
//
//        while( ++counter  <=10     ) {
//
//            System.out.println(counter);
//q
//         }


//        int counter = 0 ;
//
//        while( counter++   < 10  ){
//
//            System.out.println(counter);
//
//        }
    }
}
