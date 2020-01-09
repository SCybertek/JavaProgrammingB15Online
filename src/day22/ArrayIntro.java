package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        //inside array: element or item
        // array is object: no matter if it stores primitives inside
        // pseudo code:   b
        // typeVariable name [] = new typeVariblae [ char count ] ;
        // Array count is unchangeble
        //once we create array in certain size, we cannot change the size!!!
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

        //when you create new Array object
        //it will get default value in each element . ex: 
        
        int [] numbers = new int [3] ; //do not forget to put count inside 
        //System.out.println("numbers = " + numbers);-- you cannot do this
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]); // we did not assign numbers inside, we got 0 0 0 as outcome

        //create byte array with size 4
        //and store itinto variable called data
        //assign value for each index location , accesss them / print
        // update the last index value
        //print

        byte [] data = new byte[4];

        data [0]= 1;
        data [1]= 7;
        data [2]= 9;
        data [3]= 2;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data [3] = 4;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);


    }


}
