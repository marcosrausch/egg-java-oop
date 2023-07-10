package domain;

import java.util.UUID;

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

    public void add(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.ISBN = UUID.randomUUID().toString();
    }

    public void get(Book b) {
        System.out.println(b.toString());
    };
    
    @Override
    public String toString() {
        return "Title: " + this.title + "\n" + 
               "Author: " + this.author + "\n" +
               "pages: " + this.pages + "\n" + 
               "ISBN: " + this.ISBN;
    }
}
