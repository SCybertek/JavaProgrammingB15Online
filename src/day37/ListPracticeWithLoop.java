package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {
        //create and arraylist of integer and fill it up with 1 -100
        
        // add method takes one parameter ?

        List<Integer> nums = new ArrayList<>();
        for (int number = 1; number <=100; number++) {
            nums.add(number); // here number is not INDEX here it is NUMBER Itsefl
            // so ADD method is overloaded: can tak eboth index and value ..

        }
        System.out.println("nums = " + nums);

        //change all the odd numbers value to 0
        // here we have ALL odd numbers at EVEN index

        for (int i = 0; i < nums.size() ; i+=2) { // so index is jumping by two
            // System.out.println("odd value are at index = " + i);
            // now we got index and we need to update them to 0
            nums.set(i, 0);
        }
        System.out.println("nums = " + nums);
        
        //DIFFERENCE BTEWEEN ADD AND SET 
        // ADD : adding more item . changing SIZE (you can add on empty list
        // SET : changes the existing item and DO NOT change the size ( you cannot set an epmty list


        // HOW to find index of value 20 : ?? 

        System.out.println("nums.indexOf(20) = " + nums.indexOf(20));
        
        //Insert 100 to first index: 
        
        nums.add(0,100);
        System.out.println("nums = " + nums);

        System.out.println("nums.indexOf(20) = " + nums.indexOf(20));

        List<Integer> lst2 = new ArrayList<>();

        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        // insert 100 after 34 : we do not know where 34 is

         int index34 = lst2.indexOf(34);
         lst2.add(index34 +1 ,100);
        System.out.println("lst2 after adding 100 after 34 = " + lst2);



        
        }
    }
 
