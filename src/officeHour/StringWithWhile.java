package officeHour;

public class StringWithWhile {
    public static void main(String[] args) {

        String name = "Zehra Aygun";

        //getting each character using charAt (index)
        //generate sequantial number 0 -->10

        int x = 0 ;

        while (x<name.length()){
            System.out.println("index: "+ x);
            System.out.println(name.charAt(x));
            ++x ;

        }



    }

}
