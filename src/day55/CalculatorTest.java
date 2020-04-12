package day55;

public class CalculatorTest {

    public static void main(String[] args) {


        SimpleCalculator c1 = new SimpleCalculator();
        c1.addNum(100);
        // System.out.println(c1.result);

        c1.addNum(100).
                addNum(200).
                addNum(400); // now it returns Calculator object and now we can chain the methods (?)
        //System.out.println("c1.result = " + c1.result);
        c1.minusNum(300)
                .addNum(5)
                .displayFinalResult();

        //why make resultprivate? so it will not be accesses in main method!
        //we encapsulate it and now :
        //c1.result = -10000 ;
        //we cannot do this above! (DO NOT COOK INSIDE YOUR TEMPLATE)

        // System.out.println("c1.result = " + c1.result); how to make c1.result not attainable ? we can make it private result !

        //display method is instance method:

        //c1.displayFinalResult();

//        c1 = c1.addNum(100);
//        c1 = c1.addNum(200);
//        c1 = c1.addNum(100);
    }
}
