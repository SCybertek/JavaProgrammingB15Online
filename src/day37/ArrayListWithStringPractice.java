package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {

        ArrayList <String> superHeroes = new ArrayList<>();

        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Cyborg"); // when we remove Cyborg , Flash become the item at index 2
        superHeroes.add("Flash");
        superHeroes.add("Aquaman");
        superHeroes.add("Wonder Woman");

        System.out.println("superHeros = " + superHeroes);
        // remove any heros that does not have man in the String
        for (int x = 0; x < superHeroes.size(); x++) {

            String currentHero = superHeroes.get(x);
            if (!currentHero.contains("man")) {
                superHeroes.remove(currentHero);
                // once hero is removed, this index will be filled by next item
                // so we need to decrease the index by 1 so stay at same index
                --x; // once item is removed , it will decrease the index to stay at same index in next iteration
            }

        }
        System.out.println("superHeros = " + superHeroes);

        // take away from here :
        //  removing item during the for loop
        //  when you remove 1 item , you will have one less item in the list
        //  everything after the removed item will move to one index to the left
        //  so in order not to miss the item right after the removed item
        //  we need to decrease the index by one to stay at same index after removing


//        // Do we have superman in the list ?
//        System.out.println("superHeros.contains(\"Superman\") = "
//                            + superHeros.contains("Superman"));
//
//        // does this this contains an item with exact value of man
//        System.out.println("superHeros.contains(\"man\") = "
//                            + superHeros.contains("man"));





//        String [] names = { "miles" , "nur", "miles" , "mervin", "begli " } ;
//        for (int i = 0; i < names.length ; i++) {
//            String currentName = names[i];
//            if (currentName.contains("miles")) {
//                names[i].replace("e","o");
//            }
//        }
//        System.out.println(Arrays.toString(names));
        /// ARRRAAAYYYY dene 

        // this is how to create a copy 
        List<String> superHeroCopy = new ArrayList<>(superHeroes);
        System.out.println("superHeroCopy = " + superHeroCopy);
        
        // how to put bunch of items in ARRAY
        // this will create An UNMODIFIABLE LIST!!!
        // you cannot change it
        
        List<String> topics = Arrays.asList("Java", "Selenium", "Database", "API") ;
        System.out.println("topics = " + topics);
        // what can you do?
        //now it is regular arraylist you can do anything

        List<String> topicsCopy = new ArrayList<>( topics);
        System.out.println("topicsCopy = " + topicsCopy);







        }
    }

