package day43;

import day42.Movie;

public class MovieActions {

    public static void main(String[] args) {

        // this class has a lot of static methods to deal with Movie object / or Coffee object :)
        // this class does not serve as template for creating object
        //just like arrays class does not serve as template for creating array object

        Movie m1 = new Movie("Joker", 2.5, "Drama");
        printMovieInformation(m1);

        // M1 = is a pointer -- address to the Object : new Movie("Joker", 2.5, "Drama")

        //these do not work :
        // Because of DATA TYPE mismatch
//        int x = "Joker"; // x is a container can store number
//        Movie m = "Joker";  // m is a container can store address of any move class
//        Scanner scan = "Joker"; // m is container can store address of any scanner object

    }
        /**
         * A void method that accept any movie object
         * and print out it's information in below format
         * The movie <name> is <length> hour long and it genre is <type>
         * @param movieObj the movie object to get information from
         */
        public static void printMovieInformation(Movie movieObj) {
            //TODO YOUR CODE HERE
            System.out.println("The move " + movieObj.getName() + " is " + movieObj.getLength() + " hour long and its genre is " + movieObj.getGenre());

        }

    }

