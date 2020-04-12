package day58;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) throws IOException{

        //throws is just declaration.. there is still error when we run
        //for handling we need to use try catch block

        System.out.println("Before Try Catch");

        Files.readAllLines(Paths.get("file.txt") );
//        try {
//            Files.readAllLines(Paths.get("file.txt") );
//        }catch (IOException e) {
//            System.out.println("Exception happened and caught!");
//        }

        System.out.println("after try catch");
    }

}
