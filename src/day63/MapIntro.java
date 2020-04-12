package day63;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

    public static void main(String[] args) {
        //Compared to List , SET will store single element per item
        //map store key -value pair per item
        //thats why we need to data type inside <>
        //one for the KEY and on for the Value


        Map<String,String> nameAndStatePair = new HashMap<>();
        //hashmap is implementing clas of map interface
        //map is not child of Collection interface!
        //but it is a PART OF COLLECTION FRAMEWORK!


        Map<Integer,String> groupNumLeaderNamePair = new HashMap<>();

        //NOTE:
        //prior to java 7 we used to have Type inside diamond operator on the right side as well
        //java 7 and on we do not use second diamond operator for type anymore/ less typing basically

        Map<String, Double> groceryNameAndPricePair = new HashMap<>();

        Map<String, Boolean> voterAndEligibilityPair = new HashMap<>();

        Map<String, Integer> gameNameAndscoreMap = new HashMap<>();

        Map<Byte, Character> questionNumAndCorrectAnswerPair = new HashMap<>();


    }
}
