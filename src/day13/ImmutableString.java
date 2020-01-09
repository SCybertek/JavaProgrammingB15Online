package day13;

public class ImmutableString {

    public static void main(String[] args) {

        String name = "Pumpkin";
        System.out.println( name); // Pumpkin

        name.toUpperCase(); //everytime a name changes a NEW String is created BUT THERE IS NO REFERENCE TO IT
        System.out.println(name);

        System.out.println(name.toUpperCase()); //PUMPKIN

        //what if I really want to change the name

        name= name.toUpperCase();
        System.out.println(name);
    }
}
