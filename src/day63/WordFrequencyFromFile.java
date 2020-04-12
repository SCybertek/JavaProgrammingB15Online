package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class WordFrequencyFromFile {
    public static void main(String[] args) {

        try {
            List<String> allLines = Files.readAllLines(Paths.get("/Users/beglight/IdeaProjects/JavaProgrammingB15Online/src/day63/random.txt"));
            System.out.println("allLines = " + allLines);
            //to convert List to String : .toString method!
            String allLinesString = allLines.toString();
            Map<String,Integer> map = WordUtil.getFrequencyMap(allLinesString);
            System.out.println("map = " + map);


        } catch (IOException e) {
            System.out.println("ERROR IN HERE!!");
        }


    }
}
