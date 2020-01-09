package day36;

public class MethodWithParameter {
    public static void main(String[] args) {

    //    addOneHundred(100);
        // this is what happends when you pass primitive 100
        // sout ( x +100)

   //     addOneHundred(new Integer(100));
        //what happends when you pass new Integer (100)
        //int x = new Integer (100) ;
        //System.out.println(x + 100);
        // it almost becomes with Method with no parameter when it accepts INteger insead of int
        // iot assign th evalue of int x = new Integer (100) ;
        // this is the magic of what happens behind the scene

        //intsead of just passing 100
        //lets just store :
    //    int num = 7 ;

    //    addOneHundred(num);
        //this is what happens when you pass num behind scene ( at run time)
        // int x = num;
        // sout ( x + 100 ) ;

        //addOneHundred('5'); // it will take asci code of 5 adnd add = 153 ..
        //addOneHundred('5' + ""); // this is String we cannot use in this method


  //      addOneHundred(25); // 125

        int num = 10;
        addOneHundred(num); // 110

        //here what happens behind scene :
        //  public static void addOneHundred () {
        // int x = num ; // it is just copies whta is inside num to X
        //x = x + 110 ;
        //System.out.println(x); } // if you change the value of x, does it change the value of num ?
        //no , thats why when you rpint num then it prints 10

        //what if we print  num inside main method:

        System.out.println(num); // this gives result 10 .. why ??? because it is primitive (check Array to see changes in Object

        num = addOneHundredAndReturn(num); // here we assign method to this num

        System.out.println(num);// num value changed because we assigned and now num is no longer 10 it is 110
    }

    public static void addOneHundred (int x) {
        x = x + 100;
        System.out.println(x);
    }

    public static int addOneHundredAndReturn(int x) {
        x = x + 100;
        //System.out.println( x );
        return x;
    }

}
