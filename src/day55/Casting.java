package day55;

public class Casting {

    public static void main(String[] args) {

        int x = 10;

        //byte b = x ; below is explicit casting putting grande cup into small one
        byte b = (byte) x ;

        long y = x ; // it works because it casts automaticaly | implicit casting

        //Reference Type and variable name
        Object o = new Dog("Chihuahua"); // this is upcasting from type Dog to TYpe Object !
        //o.bark() not possible since Objcet clas does not have bark method!

        Dog d = (Dog) o; // small Dog container can not contain object! ERROR
        // we use CASTING to put object reference type into a Dog !
        // this is downcasting from type Object to Dog
        d.bark();

        // in order to let the Dog object bark , we need to refer a dog as a Dog or we don't have access to Dog only action
        // Creating object with Object reference
        Object o2 = new Object(); // our object is a Super type and we are trying to run bark method that Object is technically cannot do (?) i guess to cast
        Dog d2 =  (Dog) o2;
        d2.bark(); //means Dog = new Object !!  WRONG---CLASS CAST EXCEPTION

        // compile fine because Dog IS-A Object , BUT CLASS CAST EXCEPTION AT RUNTIME
        // Because d2 = new Object() will NOT WORK!!!

        //we got  the same objcet to bark
        //in order to let the Dog object bark , we need to refer a dog objcet as a Dog
        //so we dont have access to Dog only action

//Class Cast Exception is when Casted reference type is not matching the a super type

        //it's from trying to cast a super type into a sub type!!!

        // WHEN DOES CLASS CAST EXCEPTION HAPPEN
        // When we try to cast super type object to subtype
        // or when the object type IS-NOT-A your casted reference type

        // Shape s1 = new Circle();
        // Square s2 = (Square ) s1 // this will compile fine , but will throw CassCastException
        // because we can't do Square s2 = new Circle() ; CIRCLE IS NOT A SQUARE





    }
}
