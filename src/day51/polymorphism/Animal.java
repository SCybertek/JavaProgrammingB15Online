package day51.polymorphism;

public abstract class Animal {

    //usually we will never create a Class Animal.. it should be like a template

    public abstract void makeNoise() ;
      //  System.out.println("general animal noise");


}

// I can add more classes as long as only one class is public and name is same as file name

    class Dog extends Animal {

        @Override
        public void makeNoise () {
            System.out.println("WOOF!!");
        }


    }

    class Horse extends Animal {

        @Override
        public void makeNoise () {
            System.out.println("NEINEI!!");
        }


    }


