package day55;

public class TaxiAction {

    public static void main(String[] args) {

        Engine en = new Engine("V6",400);
        Driver d = new Driver ("Pedro",12345);
        Taxi t1 = new Taxi(101, en,d);
        //we passed the en as Engine objcet into Taxi object 

        System.out.println("t1 = " + t1);
       //output : t1 = Taxi{plateNumber=101, eng=Engine{type='V6', horsePower=400}}
                                            // this above nice output comes from toString of Engine class

        Taxi t2 = new Taxi(102,new Engine("V8", 600),
                new Driver("John", 12345));
        System.out.println("t2 = " + t2);

        //print out driver name and car horse power
        //driver <name> is driving the taxi with horsepower <>

//t2.dr.name -- is not directly chaining:
        // t2.dr -- gives us Driver object and then.name gives : the name of that object !


        //TAXI ACTION!!! COPY FROM AKBAR >> MISSIGIN STUFF IN HERE
    }
}
