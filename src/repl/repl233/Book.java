package repl.repl233;

public class Book {


        String title ;
        String author ;
        String tableOfContents= "";

        int nextPage = 1;

        public Book (String title , String author ) {
            this.title = title ;
            this.author = author ;
        }

        public void addChapter (String title, int pages) {
            tableOfContents += "\n" + title + "..." + nextPage ; //this was a little unclear.. I guess we need to += in order to increase table of contents everytime this method is called
            nextPage += pages;
        }

        public int getPages () {
            return nextPage-1; //total number of pages
        }

        public String getTableOfContents () {
            return tableOfContents;
        }

        public String toString () {
            return title + "\n" + author ;
        }
    }

