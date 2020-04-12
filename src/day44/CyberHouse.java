package day44;

public class CyberHouse {

    String design ;
    int houseNum ;
    //we can change default value of the fields
    //by assigning value directly in the template class
    // (we know that our all houses ar ein 1 neighborhood)
    //we can asssign it here in static field right now :
    private static String neighbourhoodName = "Cybertek Ave" ;
    //this can be applied to every field! even instance = BUT we rarely do it in instance field


    // before:  static String neighbourhoodName = "Cybertek Ave" ;
    //access: CyberHouse.neighborhoodName
    // now it is PRIVATE STATIC FIELD: it makes it accessible only in this class!
    // access: we need getter (?)

    //1 we can set the value
    //2 we can make access modifier PRIVATE




    //constructor can access anything!1 static or instance fields

    public CyberHouse (String design , int houseNum) {
        this.design = design ;
        this. houseNum = houseNum ;

    }
        //instance method can access anything!
    public void showAllInfo() {
        System.out.println("house: " + this.houseNum + " design: " +
                this.design + ", neighborhoodName" + neighbourhoodName);

    }

    //static method can ONLY access static memeber of the same class
    // sttaic field + static method of the SAME class

    public static void showNeighbourhoodName () {
        System.out.println("neighbourhoodName = " + neighbourhoodName);
    }// // CAN NOT ACCESS ANYTHING NON-STATIC INSIDE STATIC METHODS
    //System.out.println("houseNum = " + houseNum);

    }

