package domain;

public class Book {

    private String title;
    private String author;
    private int pages;
    private String ISBN;

    public Book() {
    }

    public Book(String title, String author, int pages, String ISBN) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.ISBN = ISBN;
    }
    
    @Override
    public String toString() {
        return "Title: " + this.title + "\n" + 
               "Author: " + this.author + "\n" +
               "pages: " + this.pages + "\n" + 
               "ISBN: " + this.ISBN;
    }
}
