package repl.repl236;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {

        String abc = "jAVA";
        System.out.println(capitalize(abc));

        String baba = "";
        System.out.println(capitalize(baba) + "here is empty");

        List<String> groceries = new ArrayList<>();

        List<String> gr = Arrays.asList("tomato","potato");

        Collections.sort(groceries );







    }

    public static String capitalize(String word) {
        if (word.isEmpty()) {
            return "";
        }else {

            String capitalWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

            return capitalWord;
        }
    }






}
