package day27;

public class StringMultiFindShortestlenghtsElement {

    public static void main(String[] args) {


        String [] developersTeam = {"Vladislav", "Hasan", "Tolkun"};
        String [] testerTeam = {"Zhibekchach", "Muhammed Sohrabi", "Nursultan"};
        String [] businessAnalystTeam = {"Lisa", "Ershad", "Naila"};

        String [][] scrumTeam = {developersTeam, testerTeam, businessAnalystTeam };


        //find the shortest String in text

        int minLength =scrumTeam[0][0].length();
        String shortestString = scrumTeam[0][0];

        for (int i=0; i<scrumTeam.length; i++){
            for (int j=0; j < scrumTeam[i].length; j++){//this is ARRAY
                if (minLength > scrumTeam[i][j].length()) {//this is string
                    minLength = scrumTeam[i][j].length();
                    shortestString = scrumTeam[i][j];
                }
            }
        }
        System.out.println(minLength);
        System.out.println(shortestString);

    }
}
