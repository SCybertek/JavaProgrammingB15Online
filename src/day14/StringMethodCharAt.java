package day14;

public class StringMethodCharAt {
    public static void main(String[] args) {
        //charAt method String
        //it will return a character at certain location specified
        String name = "Sofiya";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));

        System.out.println("--------");

        System.out.print(name.charAt(0)+ " ");
        System.out.print(name.charAt(1)+ " ");
        System.out.print(name.charAt(2)+ " ");
        System.out.print(name.charAt(3)+ " ");
        System.out.print(name.charAt(4)+ " ");
        System.out.print(name.charAt(5)+ " ");

        String aName = "Sofiya";
        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);
        char c5 = aName.charAt(4);
        char c6 = aName.charAt(5);

        //System.out.println(c1+c2+c3+c4+c5+c6); --> 619 number from ASCII table
        System.out.println( +c1 + " "+ c2 + " "+ c3+" "+c4+" "+c5+" "+c6);




    }
}
