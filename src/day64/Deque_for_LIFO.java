package day64;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Deque_for_LIFO {
    public static void main(String[] args) {

        //stack class : still exists but now Decue is more useful
        //last in first out
        //double ended queue : you can add from beginning and end
        //deque is double ended Queue ! so we can add item as always so we can removeLast last method to achieve Lats in first out 

        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review the class");
        lifoQue.add("do you homework");
        lifoQue.add("attend the class");
        lifoQue.add("stay bye to Java");
        lifoQue.add("stay bye to Java");

       // System.out.println("lifoQue.remove() = " + lifoQue.remove()); //review the class
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast()); // removes fe=rom the last that has been entered into our LinkedList 
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());



    }
}
