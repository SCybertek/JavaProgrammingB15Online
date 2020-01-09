package repl;

public class Repl120 {
    public static void main(String[] args) {
        //FInding MAX in String Array

        String [] words = { "aaa", "bbbbb", "whasstupppp", "super longg word", "java" };
        //logic
        // pick first element of an array and assume it is the max
        // then compare it with next item (loop through all array ) if next array item is bigger swap

        String max =words[0];
        for (int i = 0; i < words.length; i++) {

                if (max.length() < words[i].length() ) {
                    max = words[i];
                }


        }
        System.out.println(max);

        //or

        for (String eachWord : words) {
            if (max.length() < eachWord.length ()) {
                max = eachWord;
            }
        }
        System.out.println(max);
    }
}
