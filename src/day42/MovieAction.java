package day42;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieAction {
    public static void main(String[] args) {

        Movie m1 = new Movie();
        // if we delete no argument constructor: this code above is RED
        // we DO NOT get default constructor if we already have one in the class

        // Default constructor : a constructor that is given by compiler only if you dont have any in the class
        // and it has no parameter
        // no code inside ! Invisible


        // fist way to create an object
        System.out.println("m1 = " + m1);
        //Empty Movie
        //m1 = Movie{name='null', length=0.0, genre='null'}


        Movie m2 = new Movie("Joker", 2.2, "Drama");
        Movie m3 = new Movie("Frozen2", 1.5, "Family");
        Movie m4 = new Movie("Pursuit of Happiness", 2.0, "Drama");

        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);

        //// I WANT TO GET THE name OF M2 SEPARATELY SO I CAN DO SOME STUFF
        //   I can not access the field directly because it's private
        //   i need a getter method to access
        //   System.out.println(m2.name);

        System.out.println(m2.getName());
        // is this Movie object mutable?
        // once being created it cannot change .. right now this Movie object is immutable
        // you cannot change the name, length, type
        // it has private field
        // do not provide Setter! so it stays IMMUTABLE !
        // provide only getter to make your object IMMUTABLE ! (read only )

        //getter : accessor
        // setter : mutator

        //Create List<Movie> yourFavoriteMovieLst  add 10 Movie Objects

        // 1st way of creating List with adding values directly
        // List<Movie> myFavoriteMovieLst = new ArrayList<>(Arrays.asList(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10));

// 2nd way of creation of List
/*         myFavoriteMovieLst.add(m1);
           myFavoriteMovieLst.add(m2);
           myFavoriteMovieLst.add(m3);
           myFavoriteMovieLst.add(m4);
           myFavoriteMovieLst.add(m5);
           myFavoriteMovieLst.add(m6);
           myFavoriteMovieLst.add(m7);
           myFavoriteMovieLst.add(m8);
           myFavoriteMovieLst.add(m9);
           myFavoriteMovieLst.add(m10);
 */

// 3rd way of the creation of List with using constructor
//        myFavoriteMovieLst.add(new Movie("Avengers: Endgame",3.1,"Action"));
//        myFavoriteMovieLst.add(new Movie("Joker", 2.2, "Drama"));
//        myFavoriteMovieLst.add((new Movie("Frozen2", 1.5, "Family")));

        Movie m5 = new Movie("Batman", 3.0, "Action");
        Movie m6 = new Movie("Star Wars", 3.5, "Action");
        Movie m7 = new Movie("Grace and Franky", 1.0, "Comedy");
        Movie m8 = new Movie("Iron man VS Superman", 3.4, "Adventure Action");
        Movie m9 = new Movie("Happy Feet", 2.7, "Animation");
        Movie m10 = new Movie("Blabla", 1.9, "Animation");

        //adding to the list :
        // yourFavoriteMovieLst.add( new Movie(”Joker”, 2.6,”Drama”) ) ;


        List<Movie> yourFavoriteMovieList = new ArrayList<>(Arrays.asList(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10));

        System.out.println("yourFavoriteMovieList = " + yourFavoriteMovieList);


        //other way of printing
//        for (Movie each : yourFavoriteMovieList) {
//            System.out.println(each.toString());
//        }

        //Print the name of the movies less than 2 hours

        System.out.println("-----Movies less than 2 hours------");
        for (Movie each : yourFavoriteMovieList) {
            if (each.getLength() < 2)
                System.out.println(each.getName());
        }

        // Print all Action movies

//        System.out.println("-----All Action Movies -------");
//        for (Movie each : yourFavoriteMovieList) {
//            if (each.getGenre().contains("Action")){
//                System.out.println(each.getName());
//            }
//        }
        //If any Movie is longer than 2 hours Update the movie type to  Long(MovieType)
        //     for example : if type was Action -->> LongAction , Drama--> LongDrama


        System.out.println("-----If any Movie is longer than 2 hours Update the movie type to  Long(MovieType)");
        for (Movie each : yourFavoriteMovieList) {
            if (each.getLength() > 2) {
                each.setGenre("Long" + each.getGenre());
                System.out.println(each.toString());
            }
        }


        //Find out longest Movie name
        String longestMovie = yourFavoriteMovieList.get(0).getName();

//        System.out.println("----Longest Movie Name---");
//       for (Movie each : yourFavoriteMovieList) {
//            if ( longestMovie.length() < each.getName().length()) {
//                longestMovie = each.getName() ;
//                System.out.println(longestMovie);
//            }
//       }

        //Task 5.2 : Find out longest Movie name with for loop ??? name ucin islanok ?
//        String longestMovieName = yourFavoriteMovieList.get(0).getName();
//        for (int i = 0; i < yourFavoriteMovieList.size(); i++) {
//            if (longestMovieName.length() < yourFavoriteMovieList.get(i).getName().length()) {
//                longestMovieName = yourFavoriteMovieList.get(i).getName();
//            }
//        }
//        System.out.println("Longest Movie Name in the List is = " + longestMovieName);

        //use for each loop

        String longestName = yourFavoriteMovieList.get(0).getName();
        for (Movie eachLine : yourFavoriteMovieList) {
            if (longestName.length() < eachLine.getName().length()) {
                longestName = eachLine.getName();
            }
        }
        System.out.println("longest Movie Name With For EachLoop = " + longestName);

    }
}

