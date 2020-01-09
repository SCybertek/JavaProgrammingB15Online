package day7;

public class Casting {
    public static void main(String[] args) {
        //int num = 10;
        //10 is implicitly (automatically) converted to double 10.0
        // and stored inside bigNum behind scene

        double bigNum= 10;
        System.out.println(bigNum);

        //12.99 is double, double has much bigger range than int
        //so it just not fit
        //int num = 12.99; Complier error (does not matter if you have small coffe inside ,what matters is you are holding small coffee in big cup


        int num = (int) 12.99;
        System.out.println(num);
        //TASK :

        long num2 =73244546234l;
        int num3 = (int) num2;
        System.out.println(num3);

        int num4 = 35;
        long num5 = num4;
        System.out.println(num5);

        double num6 = 34.78;
        int num7 = (int)num6;
        System.out.println(num7);





    }
}
