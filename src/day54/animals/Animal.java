package day54.animals;

public abstract class Animal {

    // we do not wnt an object to be created ..

    public abstract void speak () ;
}

class Dog extends Animal implements IndoorPet {

    String name;

    @Override
    public void speak () {
        System.out.println("Bark!!!");
    }

    @Override
    public void play () {
        System.out.println("Dog is chasing his tail");
    }
}


