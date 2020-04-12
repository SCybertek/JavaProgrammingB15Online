package day42;

public class Movie {

     private String name;
     private double length;
    private String genre;

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }

    public Movie() {

        System.out.println("Empty Movie");
    }

    //write a constructor to set all the fields value


    public Movie(String name, double length, String genre) {
        this.name = name;
        this.length = length;
        this.genre = genre;
    }

    // toString method to directly print

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }

    //task: Add Setters to Movie Class

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }





    //Print the name of the movies less than 2 hours
    //Print all the Action movies

}
