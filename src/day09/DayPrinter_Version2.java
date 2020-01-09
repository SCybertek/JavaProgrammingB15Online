package day09;

public class DayPrinter_Version2 {

    public static void main(String[] args) {

        /*
        create a variable called dayCode as int

        if the  daycode is 1 --> Monday
        if the  daycode is 2 --> Tuesday
        if the  daycode is 3 --> Wednesday
        if the  daycode is 4 --> Thursday
        if the  daycode is 5 --> Friday
        if the  daycode is 6 --> Saturday
        if the  daycode is 7 --> Sunday

        if none f=of the above just print unknown day
         */

        int dayCode = 2;
        String dayName ="";

        //empty String . assigning empty String value
        // String dayName;



        if (dayCode == 1) {
            dayName ="Monday";
        } else if (dayCode == 2) {
            dayName ="Tuesday";
        } else if (dayCode == 3) {
            dayName ="Wednesday";
        } else if (dayCode == 4) {
           dayName = "Thursday";
        } else if (dayCode == 5) {
            dayName = "Friday";
        } else if (dayCode == 6) {
            dayName = "Saturday";
        } else if (dayCode == 7) {
            dayName ="Sunday";
        } else {
            System.out.println("Day is unknown");
        }
        System.out.println(("Day is "+ dayName));


    }
}
