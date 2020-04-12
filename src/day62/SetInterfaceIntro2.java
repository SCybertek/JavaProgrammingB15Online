package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceIntro2 {
    public static void main(String[] args) {


        //Creating a HashSet with items already inside
        //REMEMBER in HASHSET there is noooo defined ORDER!
        // THE OUTPUT CAN BE IN ANY ORDER JAVA DESIRE!!!!!!

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30);
        System.out.println("numList = " + numList);

        //removing duplicates before : nested loops
        // now just dump it into a HashSet (as a collection) and then it will does it
        Set<Integer> myNumsSet = new HashSet<>(numList);
        System.out.println("myNums = " + myNumsSet);
        //System.out.println("myNumsSet = " + myNumsSet); same result

        //hashset has a constructor that accepts other collection objects!
        //Overloaded constructor



        //Q: can we dump ArrayList elements into a HashSet?
        //yes!

        
    }

}
