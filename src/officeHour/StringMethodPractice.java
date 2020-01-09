package officeHour;

public class StringMethodPractice {
    public static void main(String[] args) {
        String letters = "J%a^V**$a";
        //remove % ^ $

        System.out.println("letters before"+ letters);
        letters = letters.replace("%","").replace("^","")
        .replace("*","").replace("$","").toUpperCase();

        //if we want to replace first one use replaceFirstmethod



        System.out.println("letters after " + letters);

    }
}
