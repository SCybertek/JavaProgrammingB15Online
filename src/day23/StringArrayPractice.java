package day23;

public class StringArrayPractice {

    public static void main(String[] args) {


        String [] shows = {"Orville", "Gifted", "Game of Throne",
                          "Flash", "Arrow", "Super Girl"};

        int showsCount = shows.length;
        System.out.println("showsCount = " + showsCount);

        for (int x = 0; x < showsCount; x++) {
            String currentShow = shows[x];
           // System.out.println(currentShow+ " has character count "+ currentShow.length() );
            System.out.println(shows[x]+" has character count "+ shows[x].length());

        }
    }
}
