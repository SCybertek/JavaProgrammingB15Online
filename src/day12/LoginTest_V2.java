package day12;

public class LoginTest_V2 {
    public static void main(String[] args) {
        String userName = "khkhkhkh";

        boolean userNameCorrect = userName.equals("ABC123");
        System.out.println(userNameCorrect);

        boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");
        System.out.println(nameCheckIgnoreCase);


        // store your name is a name variable
        //check for equality using different uppercase lowercase example
        //using equals and equalsIgnoreCase

        String name = "Sofiya Nuryyeva";

        boolean nameCorrect = name.equals("sofiya nuryyeva");
        System.out.println(nameCorrect);

        boolean nameCheckIgnore = name.equalsIgnoreCase("SOFIYA Nuryyeva");
        System.out.println(nameCheckIgnore);
        System.out.println(name.equalsIgnoreCase("SoFIYa NuryyEVA"));
    }
}
