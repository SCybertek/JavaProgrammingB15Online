package day51;

public class ComparableString {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "xyz";

        //
        System.out.println(s1.compareTo(s2));//-23
        //we got ( - ) in a result  ==== means it is less

        System.out.println(s2.compareTo(s1));
        //we got + === means it is MORE

        System.out.println(s1.compareTo(s1));
        // we got 0 ==== they are same


        //comparable:
        //comparable is an interface available in the JDK that we can use to compare objects, in a natural order.  compareTo is a method we can use to compare.
    }
}
