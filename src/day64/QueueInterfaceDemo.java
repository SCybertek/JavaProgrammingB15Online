package day64;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {

        //it is widely used in development
        //but as a tester we might need it actually
        // what kin dof structure you want to use if you wwan to have first in- first out /last in last out
        // Answer : Queue !
        //it also allows duplicates

        //what do you mean ?
        //in real life : standing in line in bank or restaurant
        // the line gets smaller .. the item in line is meant to be get in and get out /


       // linkedList implements deque

        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("review the class");
        taskQueue.add("do you homework");
        taskQueue.add("attend the class");
        taskQueue.add("stay bye to Java");
        taskQueue.add("stay bye to Java");
        System.out.println("taskQueue = " + taskQueue);

//        taskQueue.remove(); // this will remove the fist one out of the Queue
//        System.out.println("taskQueue = " + taskQueue);

        //this is first in - first out queue (FIFO - fayfo)
        // whciever items comes first , it will get removed first
        //when we use remove method from the queue interface 
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue = " + taskQueue);

    }
}
