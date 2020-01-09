package day22;

public class LoopingThroughTheArray {
    public static void main(String[] args) {



        int [] scores = new int[4];
        //asssign vale to each index
        scores [0]= 95;
        scores [1]= 9;
        scores [2]= 98;
        scores [3]= 100;
//this is how we print array!!
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        //how do we get size of any array object
        //array object has a property called length

        //if you add () it means action!!! this is a method /functionality (horse can jump, run
        //if we dont : it is a property

        /*
        what I think is that, length() - counts how many chars are in the string
and length, is a given value, you don't count array objects
         */
        int itemCount = scores.length;
        int lastItemIndex = itemCount-1;


//        for (int i = 0; i <=lastItemIndex ; i++) {
//        for (int j = 0; j <=itemCount-1 ; j++) {

        for (int x = 0; x <itemCount ; x++) {
            System.out.println(scores[x]);
        }








        //how do we get the char count of a String
        String name ="Jon Snow";
        int charCount = name.length(); // string does not have length property!!


    }
}
