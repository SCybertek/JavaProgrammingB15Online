package officeHour;

public class Practice_12_18 {
    public static void main(String[] args) {

        //TASK 1. Print all job titles - hint ( substring, indexOf)
//TASK 2: Print all FirstName-lastName jobTitle
       // for example :
       // Philipa-Salthouse Electrical Engineer
       // Ulrika-Goolding Nuclear Power Engineer
//TASK 3. Look for those 2 people in the array and assert below data
        /*
        Tracy Bartle should be Geological Engineer
        Skipper Abrahamsson should be Financial Advisor
        if true{
            Print "PASS: Verification successful. Tracy Bartle's job is Geological Engineer
        }else{
            Print "FAIL: Verification error:  Tracy Bartle's job is NOT Geological Engineer
        }
//Task 4:  //Print Initials -> Job Title for everyone
        /*
        TB -> Geological Engineer
         */


        String employee = "Analiese Van der Brugge [Web Developer II] avanderbrugge6@yelp.com";
        // print job title from this String :  Electrical Engineer

        // logic : title is in between [ and ]  so we need to find index of [ and ]
        // and use substring(right after index of [   ,  index of ]    )

        int startingIndex = employee.indexOf("[") + 1;
        int endingIndex = employee.indexOf("]");

        String title = employee.substring(startingIndex, endingIndex);
        System.out.println("title = " + title);

        /*
        * Print all FirstName-lastName jobTitle
       for example :
        Philipa-Salthouse Electrical Engineer
        Ulrika-Goolding Nuclear Power Engineer
        * */
        // "Philipa Salthouse [Electrical Engineer] psalthouse0@g.co" ;

        // logic : get first name ( first word in this sentence)
//                 get last name ( second word in this sentence) put dash in between
//                 then concatenate with the title
        // this will break if we have name more than 2 words

        // logic 2 :  get the full name directly using subString
        //            replace all the space in full name with -
        //            then concatenate with the title


        String fullName = employee.substring(0,employee.indexOf(" ["));// always works when teh first " [" shows up
        System.out.println("fullName = " + fullName); 
        
        //now we need to replace " " with "-"
        
        String fullNameWithDash = fullName.replace(" ", "-");
        System.out.println("fullNameWithDash = " + fullNameWithDash);

        System.out.println(fullNameWithDash +" "+ title);
        //task 3:
        //given expected titile for philipa salthouse is electrical engineer
        // write if statement to test if its correct or not

        if (title.equals("Electrical Engineer")) {
            System.out.println("PASS: verification successful");
        } else {
            System.out.println("FAIL: Verification fail: " + title);
        }
        //  TASK 4:
        //GET initials ans job title
        //JK-> electrical enjineer

        /*
        logic:
        get first char of full name a=
        and GET LASTNAME FIRST CHARACTER USING CHARAT (lastIndexOfSpace +1 )
         */
        System.out.println(fullName.charAt(0)+""+ fullName.charAt(fullName.lastIndexOf(" ")+1) + "->"+ title);



    }
}
