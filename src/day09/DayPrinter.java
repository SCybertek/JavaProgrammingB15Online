package day09;

public class DayPrinter {

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

        int dayCode = 7;

        if (dayCode == 1) {
            System.out.println("day is Monday");
        } else if (dayCode == 2) {
            System.out.println("day is Tuesday");
        } else if (dayCode == 3) {
            System.out.println("day is Wednesday");
        } else if (dayCode == 4) {
            System.out.println("day is Thursday");
        } else if (dayCode == 5) {
            System.out.println("day is Friday");
        } else if (dayCode == 6) {
            System.out.println("day is Saturday");
        } else if (dayCode == 7) {
            System.out.println("day is Sunday");
        } else {
            System.out.println("Day is unknown");
        }


    }
}
