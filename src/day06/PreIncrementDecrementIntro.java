package day06;

public class PreIncrementDecrementIntro {

    public static void main(String[] args) {

        //  initializing(giving value) offerCount value to 2
        int offerCount=2;
        //increasing the number using normal way;
        offerCount=offerCount+1;
        //this is increasing by using shorthand
        offerCount+=1;

        //shortcut on top of shortcut is
        //++ or -- , THIS IS EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        //we can NOT use it for any other time like increasing or decreasing  value by more than one
        ++offerCount;
        System.out.println("Offer now after increasing by one"+ offerCount);

        --offerCount;
        System.out.println("Offer now after decreasing by one"+ offerCount);

    }
}
