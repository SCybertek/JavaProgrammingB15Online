package day09;

public class LanguagePickerWithSwitch {
    public static void main(String[] args) {


        String languageOption = "Russian";
        //String greeting = "";

        switch (languageOption) {
            case "Russian":
                System.out.println("Privet");
                break;
            case "Turkish":
                System.out.println("Merhaba");
                break;
            case "English":
                System.out.println("Hello");
                break;
            case "French":
                System.out.println("Bonjour");
                break;
            case "Spanish":
                System.out.println("Hola");
                break;
            default:
                System.out.println("Language is unknown");
        }


        /*
        HERE IS THE CODE SIMILAR OF HOW AKBAR DID IN CLASS:
        (EXCEPT this one is with Scanner)
             Scanner scan = new Scanner(System.in);

        System.out.println("Type in your language number from 1-7 : ");
        int caseCode = scan.nextInt();
        switch (caseCode) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Salam");
                break;
            case 3:
                System.out.println("Hola");
                break;
            case 4:
                System.out.println("Privet");
                break;
            case 5:
                System.out.println("Merhaba");
                break;
            case 6:
                System.out.println("Bonjour");
                break;
            case 7:
                System.out.println("Gomargoba");
                break;
            default:
                System.out.println("UNKNOWN Language");

         */




    }
}
