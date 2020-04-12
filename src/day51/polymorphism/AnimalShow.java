package day51.polymorphism;

import day51.polymorphism.Animal;
import day51.polymorphism.Dog;
import day51.polymorphism.Horse;

public class AnimalShow {


    public static void main(String[] args) {

        Dog d1 = new Dog () ;


        //we are referring Dog object using Animal reference

        Animal a1 = new Dog() ;
        a1.makeNoise();
        a1 = new Horse() ;
        a1.makeNoise();
        //a1 can store a pointer to any animals (just one pointer ) .. considering that it is a subclass of Animal class

        Animal a2 = new Horse();
        a2.makeNoise();

        a2 = new Dog();
        a2.makeNoise();


    }
}
