package day59;

import java.io.IOException;

public class DangerZone {

    public static void main(String[] args) { //throws IOException { //we declared
        try {
            playWithFire(); //handle or declare !

        } catch (IOException e) {
            System.out.println("GO HERE IF YOU GET BURNED");
        }

    }


    //this a method that declare that it might throw IO exception
    //whoever calls it has to handle it
    public static void playWithFire() throws IOException {
        { //throws keyword in here just documenting! no exception thrown!
            System.out.println("some consequences may follow");
            throw new IOException("NOW YOU ACTUALLY GET BURNED");
        }
    }
}


