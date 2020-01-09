package day35;

public class WraperClassIntro {
    public static void main(String[] args) {
        int x = 10;

        // primitives do not have attributes or behaviour
        //each primitive type has wrapper class that turn in into objcet so we can treat as an object

        Integer xObj1 = new Integer(12); //old way to create the Integer Object

        Integer xObj2 = Integer.valueOf(10);

        Integer xObj3 = Integer.valueOf("10");
        // now xObj2 is an object ! we can call methods.. like : .equals

        byte bValue = xObj2.byteValue();
        System.out.println("bValue = " + bValue);
        
        double dValue = xObj2.doubleValue();
        System.out.println("dValue = " + dValue);

//        primitive -> Object  : Boxing
//        Object -> primitive  : Unboxing

        int unbox = Integer.valueOf(1234);
        System.out.println("unbox = " + unbox);

        Integer i1 = new Integer(12);
        Integer i2 = 12; // int 12 is autobpxed into Integer 12
        int i3 = i1 ; // integer is auto unboxed to int 12
        //Integer i4 = "abc"; /canooot compile ! you have to PARSE IT FIRST

        Double d1 = 3.14; // double autoboxed to d1
        double d2 = new Double(12.5); // double is unboxed to double

        
    }
}
