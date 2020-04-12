package day41;

public class Product {

    // make this Product a well encapsulated
    //make all the instance fields private so it can only be accessible in the same class
    //provide public getters and setters methods


    private String name ;
    private double price ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if ( price > 0 ) {
            this.price = price;
        }
    }


//    public  String getName () {
//        return name ;
//    }
//    public void setName (String newName) {
//       // name = newName;
//        this.name = name;
//        //keyword this. can be used to refer to the current object we are working on
//        // if we have p1. as an object that is our current object
//        // this.name = we are taling about field variable
//        // we can use to refer the instance field : this.fieldName
//        // ONLY CAN BE USED INSIDE THE INSTANCE METHOD AND LATER CONSTRUCTOR!
//
//    }
//    public double getPrice () {
//        return  price ;
//    }
//    public void setPrice (double newPrice) {
//        //price = newPrice ;
//        this.price = price;
//
//        // what if I dont want to use it?
//        // it is fine as well
//        // it makes our life better though to better understand our code !



    }

