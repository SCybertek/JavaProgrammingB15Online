package day22;

public class LoopingThroughTheArray_ReverseOrder {
    public static void main(String[] args) {



        int [] scores = new int[4];
        //asssign vale to each index
        scores [0]= 95;
        scores [1]= 9;
        scores [2]= 98;
        scores [3]= 100;
       //this is how we print array!!

        int itemCount = scores.length;
        int lastItemIndex = itemCount-1;

//        for (int i = 0; i <=lastItemIndex ; i++) {
//        for (int j = 0; j <=itemCount-1 ; j++) {

        for (int x = 0; x <itemCount ; x++) {
            System.out.println(scores[x]);
        }
// this is reverse part :
        for (int i = itemCount-1; i>0  ; i--) {
            System.out.println(scores[i]);
        }


    }
}
