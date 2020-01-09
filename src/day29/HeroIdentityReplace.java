package day29;

public class HeroIdentityReplace {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";

        // generate stars with same length as full name character count
        // one the star is generated , replace full name with Stars

        //        String[] heroSplitted = hero1.split("-");
        //        String heroCode = heroSplitted[0];
        //        String fullName = heroSplitted[1];
        String[] heroSplitted = hero1.split("-");
        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];

        String stars = "";
     //   for (int i = 1; i <= hero1.split("-")[1].length(); i++)
            for (int j = 1; j <= fullName.length(); j++) {
                stars += "*";
            }
        //        System.out.println("stars = " + stars);

        //System.out.println("stars = " + stars);

        //String heroX = hero1.replace(heroSplitted[1], stars);
        String heroX = hero1.replace(fullName, stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + hero1.replace(hero1.split("-")[1], stars));
        System.out.println("heroX = " + heroX);



    }
}
