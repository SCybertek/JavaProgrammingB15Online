package day12;

public class WakeUpClass {
    public static void main(String[] args) {
        //Wake up task
        /*
       Create a variable to store the weather of your city rihgt now:
       and write a if else if else statement to do following
       If weather is sunny -- code in sunny weather
       If weather is rainy -- code in rainy weather
       If weather is cloudy -- code in cloudy weather
       If weather is snowy -- code in snowy weather
       else -- rain or shine just keep coding anyway!!!
         */

        String weather = "Sunny";

        if (weather.equals("Sunny")) {
            System.out.println("Code in sunny weather");
        } else if (weather.equals("Rainy")){
            System.out.println("Code in rainy weather");
        } else if (weather.equals("Cloudy")) {
            System.out.println("Code in cloudy weather");
        } else if (weather.equals("Snowy")){
            System.out.println("Code in snowy weather");
        } else{
            System.out.println("RAIN or SHINE just keep CODING anyway!!!");
        }
    }
    //IF YOU USE ONLY IF WITHOUT ELSE IF ..it is actually checking all
    // IF seperate statments and it take slonger to run the code.AVOID USING SEPERATE If statemnets


}
