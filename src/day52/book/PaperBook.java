package day52.book;


public class PaperBook extends Book implements Readable {

    int weight ;
    //inherited from super : String name and author
    //add constructor to set the field

    public PaperBook (String author, String name, int weight ) {
        super (author,name);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void displayBookInfo() { // from book super class
        System.out.println("Papare Book nmae is " + name + " , and the author is: "+ author
                +" and its weight " + weight);
    }

    @Override
    public void takeNotes() { // from knowledge bank
        System.out.println("Bookmark and Taking note from " + name);
    }

    @Override
    public void read() { // this comes from readable interface
        System.out.println("Reading the " + name + " written by " + author);
    }
}
