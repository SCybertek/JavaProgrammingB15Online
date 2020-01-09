package day11;

public class StringEqualityPractice_Condition {
    public static void main(String[] args) {


        //create a program to check whether my str and assign a value
        //check wheather myStr value is Java
        // if true -->. correct word!
        // if false --> say Java!!

        String myStr = "Cava";
        if (myStr.equals("Java")) {
            System.out.println("Correct wird!!");
        } else {
            System.out.println("Say java!!!");
        }

        //update this program to add more condition
        // using else if in the middle

        /*
        check the value of myStr
        if  it is Java --> correct word
        if itis Cava --> Pumpkin!!
        else say NOT JAVA nor Pumpkin

         */
if (myStr.equals("Java")) {
    System.out.println("correct word");
} else if (myStr.equals("Cava")){
    System.out.println("Pumpkin!!");
} else {
    System.out.println("Not Java nor Pumpkin");
}

    }
}
