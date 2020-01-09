package day27;

public class StringMultiArray {
    public static void main(String[] args) {


        String [] developersTeam = {"Vladislav", "Hasan", "Tolkun"};
        String [] testerTeam = {"Zhibekchach", "Muhammed Sohrabi", "Nursultan"};
        String [] businessAnalystTeam = {"Lisa", "Ershad", "Naila"};

        String [][] scrumTeam = {developersTeam, testerTeam, businessAnalystTeam };

        int maxLength = scrumTeam[0][0].length(); // why ()??? : because Vladislav is String !!

        for (String [] each1DArray : scrumTeam) {
            for(String eachElement:each1DArray){
                if (maxLength<eachElement.length()) {
                    maxLength = eachElement.length();
                }
            }

        }
        System.out.println(maxLength); // will give us how many char has the longest element in string!
        // now we should find which one has it
        // we need loop one more time

        for (String [] each1DArray : scrumTeam) {
            for(String eachElement:each1DArray){
                if (maxLength<=eachElement.length()) {
                    System.out.println(eachElement);
                }
            }

        }
         // or you can do with one shot
            String longestString = ""; // we need it to store the longest string

        for (String [] each1DArray : scrumTeam) {
            for(String eachElement:each1DArray){
                if (maxLength<eachElement.length()) { // to compare which has the largest string
                    maxLength = eachElement.length();
                    longestString = eachElement;// if the string has tje ;argest lenghts we assing it to longest string
                }
            }

        }
        System.out.println(maxLength);
        System.out.println(longestString);// check his codes!! mendecalismadi




    }
}
