package day17;

public class WakeUp_NameCorrector_StringMethod {
    public static void main(String[] args) {
        //              012345
       // String name = " SoFIya";
        
        //String name2 ;
        //I need to turn SoFIya into Sofiya
        //charAt method can be used also uppercase lower case 
        
        //char thirdLetter = name.charAt(2);


        //char fourthLetter = name.charAt(3);
        /*
        n case of full name: 1. you need to separate first name from last name
        2. you take first name and convert first letter to upper case by
        using combination of methods substring and uppercase 3. you take remaining part of name
        and convert it to lower case by using substing and lower case
         */


        //name2 ="So"+name.toLowerCase().charAt(2)+name.toLowerCase().charAt(3)+"ya";
        //System.out.println(name2); // --- produces Soofya instead :((
        
        
        /*
        AKBARS method: 
        
        //get the first character -- make uppercase
        get the rest of the characters starting from 2nd charachter 
        then make it lowercase
        eventually concat
        
         */
        

        String name = "kHumAyRa";
        
        //String nameFixed = (name.charAt(0)+"".toUpperCase()); //we added "" to turn it into string
        //char has no method AT ALL!!
        
       // nameFixed= nameFixed + name.substring(1).toLowerCase();
        //System.out.println("nameFixed = " + nameFixed); //why it got me khumeyra ??
        
        String nameFixed = name.toUpperCase().substring(0,1);
        nameFixed+= name.substring(1).toLowerCase();

        System.out.println("nameFixed = " + nameFixed);
        // the best way to learn substring is to put location index on the String
        //1. substring has only beginning ...you need to indicate beginning and it will print until the end
        //2. substring need beginning and ending. so you can take out only a part of the string
                
    }
}
