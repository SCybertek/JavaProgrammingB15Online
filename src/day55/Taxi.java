package day55;

//Taxi Engine -- Driver -- Passenger -- Engine
//not all relationships sub class relationship..

public class Taxi {

    int plateNumber ;

    //how to add Engine? it has its own stuff/ it is an Object

    Engine eng ; // Engine class is a Type of our instance field
//just like String

    Driver dr ;

    public Taxi(int plateNumber, Engine eng,Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng +
                ", dr=" + dr +
                '}';
    }
}


class Engine {

    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}


///copy the driver class
class Driver {

    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }


}
