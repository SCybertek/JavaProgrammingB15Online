package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {

        //from 1- 100 print out how many numebrs can be divided by 15

        // to divide number by 15 : number%15==0;

        //when you hear count and sum think : how do I store the result
        //wtah will be my data type and its name ?

        int counter = 0;

        for (int i = 1; i <=100 ; i++) {

                if (i%15==0){

            System.out.println(i);
                counter+=1;
               // counter=counter+1;
               // ++counter
                }

        }

        System.out.println("The counter for numbers divisible by 15 is :  " + counter);
        //if (number )

       // System.out.println();



        //given a string with value
        //find out how many a showed in this string


        String name = "Esra Fidan Sofiya Nuryyeva ARAl";
        int cnt = 0;

        System.out.println(name.charAt(0)=='a');

        for (int x = 0; x < name.length() ; x++) {

           // System.out.println(name.charAt(x));
            char currentCharacter = name.charAt(x);

            if (currentCharacter == 'a') {
               // System.out.println("Bingo!");
                ++cnt;
            }

        }

        System.out.println("count number of a: "+ cnt);

        //single character is primitive = it is char
        //to compare character to character we need to use ==


    }
}



