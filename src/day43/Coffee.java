package day43;

import day42.Movie;

public class Coffee {

    private String type ;
    private int caffeineLevel ;
    private double price ;

    //Movie blabla ;// using another Class as data type in another blue print

    // these are attributes


        // create 3 args constructor
        //Do not let the price go below 0
        // If its less than 0 make it $1

    public Coffee () {
        System.out.println("no args constructor");
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // protecting price
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }

    public Coffee (String type, int caffeineLevel, double price ) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        setPrice(price); // inside constr you can call any method you want!
//       to avoid duplication callint setPrice method in here
//        if (price > 0) {
//            this.price = price;
//        } else {
//            this.price = 1;
//        }

        //System.out.println("3 args constructor");
    }

    public Coffee (String type, int caffeineLevel ) {
            this.type = type ;
            this.caffeineLevel = caffeineLevel ;
        System.out.println("2 Args constrctor");
        }
    }




