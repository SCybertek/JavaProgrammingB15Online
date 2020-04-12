package day52.book;

public abstract class Book implements KnowledgeBank {
    //our idea:
    //Book is a n abstract idea : String name, author
    //concrete idea - papar book and audio book
    //attributes: paperBook - int weight
    // audio : double duration

    String name;
    String author;

    //display book info : let it be an abstract method.. so , it will be a job of concrete class!!
    public abstract void displayBookInfo();

    //add constructor to set the field

    public Book(String name, String author) {
        this.author = author;
        this.name = name;
    }
    //we will be printing in sub class..so no need to create
    //toString in super class

    //public abstract void takeNotes () ; from interface

}