package officeHour;

public class Practice {
    public static void main(String[] args) {

        String message = "  A  BC   " ;
        //trim -->> take out spaces at beginning and ending of a String object
        //it doesnot take space out of in between character

        System.out.println("message = <" + message + ">");
        String messageTrimmed =  message.trim();
        System.out.println("message = <" + messageTrimmed + ">");

        //isEpmty -->> check whether a string object is empty , meaning thereis nothing inside

        String emptySpace = "       ";
        System.out.println("emptySpace = <  " + emptySpace+">");

        String emptySpacesAfterTrimmed = emptySpace.trim();
        System.out.println("empty spaces after trimmed lenghts is "+ emptySpacesAfterTrimmed);
        System.out.println("empty Spaces After trimmed is empty??:"+ emptySpacesAfterTrimmed.isEmpty());

        //isEmpty VS isBlank method from String class
        // isEmpty--->if yourString.length()>0 tre it's false
        //isBlank --> if you have only white space, get true else get false

        System.out.println(" Empty spaces is blank or not ?? " + emptySpace.isBlank());


        //indexOf --> give you location of the string you are looking for inside anotherString
        //foe example yourString.indexOf("abc")
        //copied from above sp we can see what we have --> String message ="  I love  java  ";
        String message1 ="    I LOVE JAVA  ";
        int locationOfLove = message1.indexOf("LOVE");
        System.out.println("locationOfLove = " + locationOfLove); // 6
        
        //lastIndexOf -- gives you last location of the string you are looking for

        int lastIndexOf = message1.lastIndexOf("V");
        System.out.println("lastIndexOf = " + lastIndexOf); // 13 , son harf V
        
        //contains: check whether a String exists inside another String and return true or false
        boolean messageContainLove = message1.contains("LOVE");
        System.out.println("messageContainLove = " + messageContainLove);
        

    }
}
