package day45;

public class Phone extends Electronic{

    //SubClass inherit every visible instance field static field


    //inherited:
    // String brand ;
    //
    // static boolean useElectricity = true ;

    // only phoen has :

    double size ;
    double price ;


    //bad idea to have main here
    //but we are doing it anyway for less screen to look at

    public static void main(String[] args) {

        Phone p1 = new Phone () ;
        p1.size = 12 ;
        p1.price = 399 ;
        p1.brand = "Apple" ;
        // static boolean useElectricity has to accessed the static way!
        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity); // calling by subclass
        System.out.println(useElectricity);

    // how to call sharBrand method
        p1.showBrand();

        //how to call displayUseElectricity static method
        displayUseElectricity();

    }
}
