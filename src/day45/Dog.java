package day45;

public class Dog extends Animal{

    // how to override ?
    //just copy and then put your own stuff

//    public void speak () {
//        System.out.println("bark");
//    }

    //or just generate


// WHy do we want to call super class version of overriden method?
    // we want  to build on top of whats already written
    // code reuse
    // parent provide steps abc
    // child wants to do abc def
    // so instead of repeating abc
    // child can directly call super class version of the method
    // to perform  abc then add defg

    @Override
    public void speak() {

       // speak(); NEVER DO THAT .. it is like infinite loop STACK OVERFLOW ERROR
        //to call super class version of the method:
        super.speak();
        //super. can be used to specify  that we are calling super class version of the method
        //Can we use super. outside the instance method ?
        //BIG NOOOOOOOO !!!!!
        // it can only be used inside instance method

        System.out.println("Bark!!!");
        super.speak();
        super.speak();
        // in constructor we used super call only in the beginning
        // we can use super. or this. as many times as we want


    }// this is instance method..we need an object to call it


    // for overriding it has same method signature/ same result/ same access modifier

    public static void main(String[] args) {

        Dog twix = new Dog () ;
        twix.speak();


    }

    //OVERLOADING VS OVERRIDING
//Overloading :same method name & different parameter in the same class
//Overriding : parent child relationship is a MUST
//has same method name signature & same parameter list ALWAYS
}
