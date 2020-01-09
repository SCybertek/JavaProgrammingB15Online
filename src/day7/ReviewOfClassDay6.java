package day7;

public class ReviewOfClassDay6 {
    public static void main(String[] args) {


/*
Arithmetic operations
Remainder operation : 10/3 = 3 ; 10%3 = 1
Scanner nextLine() methods
will capture everything until user press Enter on keyboard

How to capture single word and save it as String --> next();
use this if you have one word only

whole number : nextInt(), nextByte(), nextShort()
fractional number: nextFloat(), nextDouble();
THERE IS NO nextChar()
boolean value --> nextBoolean()



The problem with mixing nextX() and nextLine()
Whenever we use nextLine after nextX() methods,
It will "accidentally" capture the "Enter keyboard press" to create the confusion of nextLine() method is not working
scan.nextLine() : add this to capture enter keyboard

Shorthand!! finish from CANVAS

The special case of increasing and decreasing numbers by 1
increment and decrement operator come in: ++ --

int offer=2;
offer+=1; //3
++offer; //4
+++ is increament operator. will take onevariable and increase by 1
 */


int apple = 10;
System.out.println("original apple number is "+ apple);
//apple = apple +1;
apple+=1;
++ apple;
// apple++; what does it do?? Will talk about it later


System.out.println("Used ++ twice then apple is " + apple);

--apple;
//apple-=1;


System.out.println("Used -- once then apple is " + apple);
 System.out.println("Used ++ to increment and concatenate: "+      (++apple));


    }

}
