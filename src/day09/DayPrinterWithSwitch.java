package day09;

public class DayPrinterWithSwitch {

    public static void main(String[] args) {

/* Difference between Switch and IF
//switch statement is not for range check ..it is only to check exact
value of a certain variable and do action accordingly.
Can you do everything you can do with switch with IF else? YES
Can you do everything you can do with IF statement with Switch statement? No
 */
        int dayCode = 5;

        switch (dayCode) {
            case 1 : //1 is the actual value you are cheking !!!
                System.out.println("Day is Monday");
            break; //used to get out of this branch
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Day is unknown");
        }


    }
}
