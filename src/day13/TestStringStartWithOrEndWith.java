package day13;

public class TestStringStartWithOrEndWith {
    public static void main(String[] args) {
        String name = "Muge";
        //check if a String start with another String
        System.out.println(name.startsWith("Mu"));
        System.out.println(name.startsWith("mu"));

        //check if a String end with another String
        System.out.println(name.endsWith("GE"));
        System.out.println(name.endsWith("e"));
        System.out.println(name.equalsIgnoreCase("muge"));

        //Can you add 2 methods ? answer is yes , but we did not do it yet
        //like this maybe ? :
         System.out.println(name.equalsIgnoreCase("muge") && name.endsWith("E"));
                             //    true                   &&    false ---->>>> false
    }
}
