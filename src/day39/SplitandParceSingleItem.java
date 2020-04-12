package day39;

public class SplitandParceSingleItem {
    public static void main(String[] args) {


        // we want to separate items:

        String itemDetails = " Dyson Vacuum,399,16.25";
        String [] itemSplitArr = itemDetails.split(",");

        String name = itemSplitArr[0];
        System.out.println("name = " + name);

        double price = Double.parseDouble( itemSplitArr[1]) ; // parse is Used to convert STRING into NUMBERS!! (primitives)
        System.out.println("price = " + price);

        double monthly = Double.parseDouble( itemSplitArr[2]) ;
        System.out.println("monthly = " + monthly);

        itemDetails = name + ", " + price*0.2 + ", " + monthly*0.2 ;
        System.out.println("itemDetails = " + itemDetails);

        // or second way :

        System.out.println("item name = " + itemDetails.split(",")[0]);
        System.out.println("item price= " + itemDetails.split(",")[1]);
        System.out.println("item monthly= " + itemDetails.split(",")[2]);

        // in this version belowe we do not only split but also parsing it at the same time

        System.out.println("item name = " + itemDetails.split(",")[0]);
        System.out.println("item price= " + Double.parseDouble(itemDetails.split(",")[1]));
        System.out.println("item monthly= " + Double.parseDouble(itemDetails.split(",")[2]));


    }
}
