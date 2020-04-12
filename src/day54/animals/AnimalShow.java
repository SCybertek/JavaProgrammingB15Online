package day54.animals;

public class AnimalShow {

    public static void main(String[] args) {


//Dog IS - A Dog
//Dog IS - A Animal
//Dog is a Object
//Dog IS - A IndoorPet

    Dog d1 = new Dog ();
    d1.play();
    //refer a dog object as a dog.
        // now it can do everything
        //including Animal and IndoorPet stuff

    Animal a1 = d1 ; // the address of Dog object is copied from d1 into a1 with a REFERENCE TYPE OF ANIMAL
    a1.speak(); // ==> at run time it goes inside DOG object and it calls the overridden method /Object Type
        //==> at compile time reference type defines what you can access..

    //refer a dog object as Animal
        //now it can do those things that animal can do
        //only speak method in this case
    Object o1 = d1; // Calling the dog with Object type
        //refer a dog object as Object
        //now it can do those things that Object can do
        //for example toString, hashCode and others

        //o1.speak() ; ===> not compiling !! no speak method available in Object class

    IndoorPet p1 = d1;// inside p1 we have reference variable for indoor pet
    p1.play();
        //refer a dog object as IndoorPet
        //now it can do those things that IndoorPet can do
        //only play



    }
}
