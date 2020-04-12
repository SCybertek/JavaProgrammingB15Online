package codingBat.mapPractice;

import java.util.Map;

public class WordMultiple {

    int number ;


    public void printNum(){
        System.out.println("this is number");
    }

    public void printNum(int num){
        System.out.println("hello num parameter");
    }

    public static void main(String[] args) {
        WordMultiple abc = new WordMultiple();
        abc.printNum();
        abc.printNum(23);
        abc.number = 34;
        System.out.println("abc = " + abc.number);
    }
    //TODO Given an array of strings, return a Map<String, Boolean>
    // where each different string is a key and its value is true if that string appears 2 or more times in the array.



//    public Map<String, Boolean> wordMultiple(String[] strings) {
//
//    }

    //?? I dont know



}
