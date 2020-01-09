package day10;

public class SeasonAction {
    public static void main(String[] args) {
        /*

        What do you do in each season

        Spring --> Hike! Easter, Nawruz, Blossom
        Summer --> Swim, Vacation, BBQ, Holiday
        Fall --> Harvets,Halloween, Black Friday. Shopping
        Winter --> Snowborading, Skiing, Christmas, New Year

         */

        String season = "java";

        switch (season) {

            case "Fall":
                System.out.println("This season is for Harvets,Halloween, Black Friday. Shopping");
                break;
            case "Winter":
                System.out.println("This season is for Snowborading, Skiing, Christmas, New Year ");
                break;
            case "Spring":
                System.out.println("This season is for Hike! Easter, Nawruz, Blossom ");
                break;
            case "Summer":
                System.out.println("This season is for Swim, Vacation, BBQ, Holiday");
                break;
            default:
                System.out.println("There is no such season!");
                //if default is removed there will not be any outcome if season is selected wrong


        }
    }
}
