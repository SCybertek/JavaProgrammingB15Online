package day14;

public class IndexOfPractice {
    public static void main(String[] args) {
        //indexOf -->
        //find out of another String inside This String
        //             012345678
        String name = "Game of Java and Cava"; // count or length is 12, last char index is 11
        //find out the location od java
        //find out the location of letter o
        //find out thr location of first space
        System.out.println("find out the location od java");
        System.out.println(name.indexOf("Java"));

        System.out.println("find out the location of letter o");
        System.out.println(name.indexOf("o"));

        System.out.println(name.indexOf("va"));

        System.out.println(name.indexOf("O"));
        // -1 : minus number if appear because there is no O

        System.out.println(name.indexOf("a"));

        System.out.println(name.indexOf(" "));

        System.out.println(name.indexOf("C"));

    }
}
