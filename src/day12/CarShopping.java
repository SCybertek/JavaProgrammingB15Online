package day12;

public class CarShopping {
    public static void main(String[] args) {

        // Buy corolla or tesla (only if its within the budget)
        //we dont know what car is it and we dont know the price
        //once we take out the cloth
        //we check whether its toyota, it is we buy it without checking th epric e
        //if its not we cjeck if its a tesla and also check whether it is within th ebudget

        String carBrand = "corolla";
        int budget = 40000;
        int carPrice = 60000;

        if (carBrand.equals("corolla") || ( carBrand.equals("Tesla") && carPrice<= budget)) {
            System.out.println("Car Aquired!!");
        } else {
            System.out.println("Not what I am looking for");
        }

        // Second way of doing it

        if (carBrand.equals("corolla")){
            System.out.println("CAR AQUIRED!!!");
        } else if (carBrand.equals("Tesla")&& carPrice<=budget) {
            System.out.println("CAR AQUIRED!!!");
        } else {
            System.out.println("NOT what I am looking for");
        }

        //in secodn version you can do more action. but you also repeating yourselves.DRY: dont repeat yourselves
    }

}
