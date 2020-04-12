package day63;

import javax.print.DocFlavor;
import java.util.*;

public class GroupNameTask {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sofiya Nuryyeva");
        names.add("Ainura Tukes");
        names.add("Burhan Kaya");
        names.add("Tugba Polat");
        names.add("Sezgin Caliskan");
        names.add("Seda Civan");
        names.add("Nuran Demir");
        names.add("Mariia Lukianenko");

        Map<String,Integer> nameCharCountPair = new HashMap<>();
        for (String eachmember : names ) {
            nameCharCountPair.put(eachmember,eachmember.length());
        }
        System.out.println("nameCharCountPair = " + nameCharCountPair);

    }
}
