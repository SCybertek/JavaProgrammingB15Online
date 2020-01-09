package thanksgivingTasks;

public class Task1 {
    /*
    Given a String with any possible length including 0
print first 2 characters only if the String has more than 1 character
if the String is empty print Empty String
else print the first char twice in same Link
    for example :
        "abcde" --> ab
        ""        --> empty String
        "J"       --> JJ

     */

    public static void main(String[] args) {

        String name = "";


       // System.out.println(name.charAt(0));


        if (name.isEmpty()){
            System.out.println("Empty String");
        } else {
            System.out.println(name.charAt(0)+" "+name.charAt(0));
        }

        /*
        When searching from google ,
it will always show your search keyword in tab name
for example if you search Java
your tab title is : Java - Google Search
Create a program to ask user to
enter a String with any number of word
Create a variable called searchKeyword to save user input
Create another String variable called tabTitle
assign tabTitle value to searchKeyword +  "- Google Search"
Check if tabTitle start with your searchKeyword
and end with - Google Search
If so print the test has passed , if not print test has failed
(Assume you don't know tab title is already correct
in real world , we will capture it with automation)

         */


    }

}
