package day07;

public class EmailBuilder {
    public static void main(String[] args) {
        String firstName, lastName, company;
        firstName= "Sofiya";
        lastName= "Nuryyeva";
        company = "verizon";
        char atSign='@';
        String email =(firstName+"_"+lastName+atSign+company+".com");

        System.out.println("My name is "+firstName+" "+lastName+ " and I work for "+ company+" and my email is "+email);




    }
}
