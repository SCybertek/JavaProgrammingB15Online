package day61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {

        //AKBARS comments:
        // ArrayList is backed by array in the back
        // so if we have ArrayList with 4 elements
        // in the back we have array with size 4 holding all those elements

        // if you add one item to the list using add method
        // it will create an array with size 5 then copy all for above
        // and add the new item at the end

//        List<String> lst = new ArrayList<>();

        // linked list is backed by something called Node
        // see it as 4 people holding hands
        // the neighbouring person have pointer to previous and next person
        // because they are holding hands

        // if you want to add one person ,
        // new person will just have to hold last person's hand
        // if you want to insert in the middle
        // new person just need to hold previous and next person's hand

//LinkedList is fast for adding and deleting elements,
// but slow to access a specific element.
// ArrayList is fast for accessing a specific element but
// can be slow to add to either end, and especially slow to delete in the middle.

        List <String> mom = new ArrayList<>();

        List<String> lst = new LinkedList<>();
        lst.add("Zeynep");
        lst.add("Ershat");
        lst.add("Mervin");
        lst.add("Miles");
        lst.add("mervin");


        System.out.println("lst = " + lst);

//        lst.remove("Ershat");
//        System.out.println("lst = " + lst);
        
        lst.add(4,"Begli") ;
        System.out.println("lst = " + lst);




        //difference is performance !

        //arrayList is faster in getting element ..but slower in changing the element
        // getting in LinkedList  : in linkedlist the only element that know 99 is 98 and 100 SO it is SLOWER

        //in ArrayList we know where that guy live,
        // his address(index), LinkedList==> we dont know address and
        // thats why we have to ask all peoples step by step !

        //linkedList is another type of List but different :
        //ArrayList internally uses Array ..it cretaes a new array and append to List
        //then when we remove a new separate array is created again
        //

        //LinkedList is backed by NODE -- is like a man that holds elements :P (has pointers)
        // elements are pointing to each other. it has diferent structure
        //removing requires change in the pointers(address)

        //LinkedList:  each objects are doublly linked in the LinkedList
        //doublly linked: adding & removing (add(),
        //      remove()) data are faster
        //      retriving data (get() ) is slower Is not array based class
        

        //Linkedlist faster than Arrayslist at adding and removing elements in the middle ..
    }
}
