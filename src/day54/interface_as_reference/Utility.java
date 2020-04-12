package day54.interface_as_reference;

public class Utility {

    public static void main(String[] args) {

//how to call static ? just call

        Wearable w1 = new Watch();
        wearMyWearable(w1);
        //We wear watch on our hands - Watch object type decides what shows during the run time

        Wearable w2 = new Clothes();
        wearMyWearable(w2);
        //We can wear clothes -- objcet is Clothes thats why we see this message

        Wearable w3 = new MakeUp();
        wearMyWearable(w3);

        Wearable w4 = new Perfume();
        wearMyWearable(w4); // here object is packeged up


        wearMyWearable(new Watch()); // here we are passing Object directly
        wearMyWearable(new Perfume());
        //wearMyWearable( new String()); String is not wearable

        System.out.println("\n--Calling the getMyWearableObject --\n ");
        Wearable result = getMyWearableObject();
        System.out.println("result = " + result); // hash code here

        System.out.println(result.getClass().getSimpleName()); //MakeUp -- Class name is returned

    }

    public static String getMyString () {
//        String str = new String("blabla");
//        return str;
        //or
        return new String("blabla");
    }

    //create a static method wearMyWearable
    //it has 1 parameter with type wearable/ an interface as Data type!
    // class or even abstract class or even Interface can become our DATA TYPE

    public static void wearMyWearable (Wearable any) {
        any.wear();
    }

    //why we made it static?
    // we want to access it directly

    //create a static method called getMyMyWearable
    //it return a wearable object or anything wearable

    public static Wearable getMyWearableObject () {
        //return new Clothes();
//        Wearable w1 = new Watch();
//        return w1; // the object address
        //we can do any of above or belows . Just one ov them
//        return new Watch () ;
//        return new Perfume();
        return new MakeUp();
    }
}
