package day12;
import java.util.Scanner;
public class SeasonTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please!!");
        String season = scan.next();

        if (season.equalsIgnoreCase("Spring")){
            System.out.println("Hiking,Navruz, Allergy season");
        } else if (season.equalsIgnoreCase("Summer")){
            System.out.println("Pool,Swimming, Beach");
        } else if (season.equalsIgnoreCase("Fall")){
            System.out.println("BBQ, Risding bike, Just Code");
        } else if (season.equalsIgnoreCase("Winter")){
            System.out.println("CODE!! SKI, Sledding");
        } else {
            System.out.println("Not Valid!!");
        }
    }
}
