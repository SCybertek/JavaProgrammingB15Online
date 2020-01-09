package day12;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {
        int month = 2;
        if (month<1 || month>12){
            System.out.println("INVALID MONTH");
        } else if (month>=3 && month<=5){
            System.out.println("It's Spring");
        } else if (month>=6 && month<=8){
            System.out.println("It's Summer");
        } else if (month>=9 && month<=11){ // also, month>8 && month<12
            System.out.println("It's Fall");
        } else if (month==12 || month==1 || month==2) { // some logic problem is here -
            System.out.println("It's Winter");
        }


    }
}
