package day15;

public class StringCaseINsensitiveCheck {
    public static void main(String[] args) {
        String name = "Arya Stark";
        System.out.println(  name.contains("st"));

        //I wanna check whether this name contains ST no matter case
        //so I want to store the uppercase version of this name then check for ST --
        // does not matter lower case or upper case, just make sure they are on the same case

        String upperCaseName = name.toUpperCase(); // "ARYA STARK"
        System.out.println("uppercase Name contains St or not? " + upperCaseName.contains("ST"));

        String lowerCaseName = name.toLowerCase(); // "arya stark"
        System.out.println("lowercase Name contains st or not? " + lowerCaseName.contains("st"));


         //can we do it in ONE SHOT
        //this is called method chaining, combining multiple method call
        //make it all lowercase and check for st.

        System.out.println(name.toLowerCase().contains("st"));//this works because name.to lowercase -->String and you can keep doing other String methods!!
       // System.out.println( name.length().toUpperCase());
        //this cannot be because the result of lenght is INT and it cannot go to upper case!!!
        //no related functions! BAD IDEA




    }
}
