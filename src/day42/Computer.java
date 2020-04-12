package day42;

public class Computer {

    // this is instance field !
    // we can encapsulate it and make it private . we can access the data using getters and setters
//attributes:  make it private
//		brand, ram (1-128) , price
//	behaviour
//		runProgram
//			--> print brand is running program with the ram  (size)
//		calculate
//			-->> print brand is calculating
//		add getters and setters to all the fields
//		ram can not be less than 1 more than 128
//		price can not be less than
//		toString method

    //attributes:

    private String brand ;
    private int ram ;
    private long price ;

    public long getPrice() {
        return price;
    }



    public void setPrice(long price) {
        // price should not be less than 20
        if (price > 20) {
            this.price = price;
        }
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        //here we can put some specification
        // it cannot be less than 1 or more than 128
        if ( ram >= 1 && ram <= 128) {
            this.ram = ram;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void runProgram () {
        System.out.println(this.brand + " is running program with the ram " + this.ram);
    }

    public void calculate () {
        System.out.println(this.brand + " is calculating ");
    }


   // @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
