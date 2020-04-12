package day52.book;

public interface KnowledgeBank {

    public abstract void takeNotes () ;

    //in interafce if a method has abody it has to be either static or default
    public default void showTableOfContent () {
        System.out.println("Chapter 1 till Chapter 10 : you do the rest");
    }
}
