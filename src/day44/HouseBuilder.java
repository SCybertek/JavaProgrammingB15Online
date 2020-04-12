package day44;

public class HouseBuilder {
    public static void main(String[] args) {

        CyberHouse.showNeighbourhoodName();

        CyberHouse c1 = new CyberHouse("Vintage", 12);
        c1.showAllInfo();
        CyberHouse c2 = new CyberHouse("Classic", 34);
        c2.showAllInfo();

        //house: 12m design: Vintage, neighborhoodNameCybertek Ave
        //house: 34m design: Classic, neighborhoodNameCybertek Ave ??????

        //System.out.println(CyberHouse.neighbourhoodName );


        // How do I get max value of Short
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
    }
}
