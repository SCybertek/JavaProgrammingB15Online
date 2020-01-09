package day30;

import day18.SmartLockOpenerDoWhileLoop;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        String car = "Lexus-IS-F";

        String[] carSplitted = car.split("-", 2);
        System.out.println("Car splitted = " + Arrays.toString(carSplitted));
        System.out.println("Car: "+ car);


        String model = carSplitted[1];
        System.out.println("model: "+ model);

        //3 questions to ask method:
        //
        // what does it do ?
        // it will split the string into multiple part

        // do I need to give extra info?
        //yes, we need to get infor where to split

        //what do I get out of it ?
        // we get String array out of it with each part splitted

        //Does it changes ORIGINAL STRING???
        //NOOOOOOOO!!!


    }
}
