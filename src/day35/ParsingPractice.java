package day35;

import java.util.Arrays;

public class ParsingPractice {
    public static void main(String[] args) {
        String sentence = "I bought 3 tomato and the price was 3.14 each";
        //how much is your final checkout price
        //the count is always 3rd word
        //the price is always at 2nd word from the last

        //LOGIC:
        //split by space and get string Array


        String [] allWord = sentence.split("-");
        int count = Integer.parseInt(allWord[2]) ; // this gets integare from string

       // double price = Double.parseDouble(allWord[allWord.length-2]);


         //if this is TOOlong lets create variable
        String priceString = allWord[allWord.length-2];
        //priceString= priceString.replace(",","."); // ?? niye islanok bu indi ?

        double price = Double.parseDouble(priceString);

        System.out.println("Total price is "+ price*count);

        //System.out.println(Integer.parseInt(split[2]) * Float.parseFloat(split[ split.length-2  ]));
        }


    }

