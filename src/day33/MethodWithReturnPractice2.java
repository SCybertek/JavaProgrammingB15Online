package day33;

public class MethodWithReturnPractice2 {
    public static void main(String[] args) {

                /** covertNumberToDay
                * This method will take number from 1-7
                * and convert that to actual day in word
                * @param int dayCode to represent day in number
                * @return the day in word in English as String
                *         if the number is valid
 *               if the number is not 1-7 return INVALID DAY!
                */
        //TODO 1, Call your method here to test
        System.out.println(getDaysOfTheWeekFromNumber(3) );

        //TODO 2, OPTIONALLY , Create an int Array that has 5 numbers, test your code with those

        int [] arr = {1,3,5,7,4,34};
        System.out.println(getDaysOfTheWeekFromNumber(arr[3]));// ? not sure if that iswhat was asked
        // how to check for all of them

        for (int i = 0; i <arr.length; i++) {
            System.out.println(getDaysOfTheWeekFromNumber(arr[i]));

        }
        System.out.println("------------------------");

        for ( int eachDay : arr) {
            System.out.println("each day: "+ getDaysOfTheWeekFromNumber(eachDay));
        }

    }

    public static String getDaysOfTheWeekFromNumber(int dayCode) {

        /* * Get Days Of The Week From Number Without Switch Statement
     * @author Seda
                * @param daycode
                * @return
     */


//    public static String getDaysOfTheWeekFromNumber2(int daycode){
//        String [] daysArray={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//        String day="";
//        if(daycode>0 && daycode<=7 ){
//            day=daysArray[daycode-1];
//        }else{
//            day="FUNDAY";
//        }​
//        return day;

        switch (dayCode) {

            case 1:
                return "Monday";
//                dayName = "Monday";
//                break ;
            case 2:
                return "Tuesday";
//                dayName = "Tuesday";
//                break ;
            case 3:
                return "Wednesday";
//                dayName = "Wednesday";
//                break ;
            case 4:
                return "Thursday";
//                dayName = "Thursday";
//                break ;
            case 5:
                return "Friday";
//                dayName = "Friday";
//                break ;
            case 6:
                return "Saturday";
//                dayName = "Saturday";
//                break ;
            case 7:
                return "Sunday";
//                dayName = "Sunday";
//                break ;
            default:
                return "FUNDAY!!";
//                dayName = "FUNDAY!!";
        }

//        String dayOfTheWeek="";
//
//        if (dayCode==1) {
//            System.out.println("Monday");
//        } else if (dayCode==2) {
//            System.out.println("Tuesday");
//        } else if (dayCode==3) {
//            System.out.println("Wednesday");
//        } else if (dayCode==4) {
//            System.out.println("Thursday");
//        } else if (dayCode==5) {
//            System.out.println("Friday");
//        } else if (dayCode==6) {
//            System.out.println("Saturday");
//        } else if (dayCode==7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Funday :)");
//        }
//       return dayOfTheWeek;
//    }

/**
 *  switch (dayCode){
 *             case 1:
 *                // dayName = "Monday");
 *                return "Monday; // the moment you rach return you are OUTT
 *               //  break; ---- no need to have break either!!!!!!!!!!!!!!WOOWW
 *             case 2:
 *                // dayName = "Tuesday");
 *                return "Tuesday"; // so we can just do return and put our dayName!! LESS CODE!!
 *                 break;
 *             case 3:
 *                dayName = "Wednesday");
 *                 break;
 *             case 4:
 *                 dayName = "Thursday");
 *                 break;
 *             case 5:
 *                 dayName = "Friday");
 *                 break;
 *             case 6:
 *                 dayName = "Saturday");
 *                 break;
 *             case 7:
 *                 dayName = "Sunday");
 *                 break;
 *             default:
 *                 dayName = "FUNDAY");
 *         }
 *         return dayName;
 *     }
 *
 *
 *
 *     other method:  public static String getDaysOfTheWeekFromNumber(int daycode){
 *
 *         String [] daysArray={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
 *         String day="";
 *         if(daycode>0 && daycode<=7 ){
 *             day=daysArray[daycode-1];
 *         }else{
 *             day="FUNDAY";
 *         }
 *         return day;
 */

}
}
