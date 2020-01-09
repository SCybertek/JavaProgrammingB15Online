package day15;


public class NameCheckerWarmUp {

    public static void main(String[] args) {
String name = "Sofiya";
if (name.length() <4){
    System.out.println(" Short namde");
} else if (name.length() >= 5 && name.length() <=10){ // or we can only the name length<=11
    System.out.println("medium name");
        } else {
    System.out.println("long name");
        }
//AKBAR WAY OF DOING THIS :
        /*
         Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name please : ");
        String name = scan.next();

        int lenthOfTheName = name.length();
        System.out.println("lenth Of The Name = " + lenthOfTheName);

        if (lenthOfTheName < 4) {
            System.out.println("Short Name");
            //}else if( lenthOfTheName >= 4 && lenthOfTheName <= 11   ){
            // lenthOfTheName >=4
        } else if (lenthOfTheName <= 11) {

            System.out.println("Medium Name");
        } else {
            System.out.println("Longer name");
        }
         */

 if (name.contains("a") || name.contains("e")){
     System.out.println("name contains a or e");
 } else {
     System.out.println("I dont have both a or r in my name ");
 }


    }
}
