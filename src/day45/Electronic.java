package day45;

public class Electronic {
    String brand ;

    static boolean useElectricity = true ; // this is static field
    // it is not instance field because this goes to every OBJECT in this class
    //accessible static way
    //this is default is not accessible in different pakage

    public void showBrand() {
        System.out.println("brand = " + brand);
    }
    // this is instance method and can be called only : ObjectName.showBrand ()


    public static void displayUseElectricity () {
        //this is static method we call it
        // ClassName.displayUseElectricity
        System.out.println("displaying useElectricity " + useElectricity);
    }
}
