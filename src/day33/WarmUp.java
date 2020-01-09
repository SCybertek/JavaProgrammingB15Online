package day33;

public class WarmUp {
    public static void main(String[] args) {

       // getSpelledName("Sofiya");-- this does not print !!!! we got result but we did nothing with it
        //to call a method that is not VOID we have :
//
//        String spelledName = getSpelledName("Sofiya");
//        System.out.println("spelledName = " + spelledName);
//
//        //or
//        System.out.println(getSpelledName("Begli") );

        System.out.println(getSpelledName2("Irina"));

        //void method does not generate the value
        //but this DOES!!!!


    }

    /*
    getSpelledName
    this method will take a string
    for example: Akbar --> A-k-b-a-r
    @param name this is the name parameter
    @return the name has dash in between
     */


    public static String getSpelledName(String name) {

        String result = "";

        for (int i = 0; i < name.length(); i++) {
            result = result + name.charAt(i);
            if (i !=name.length()-1) {
                result=result+"-";
            }
        }


        return result;
    }


    public static String getSpelledName2 (String name) {

        String result = "";
        //keep adding dash until right before the last char
        //then concatenate last char

        for (int i = 0; i < name.length()-1; i++) {
            // this loop wil add dash after each char
            //until 2nd char from the last
            result += name.charAt(i)+"-";

        }
        //result has everything but last char
        //so we need to add last char to the result
        return result+ name.charAt(name.length()-1);
    }


}