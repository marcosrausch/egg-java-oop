package javaoop01;

import domain.Book;

public class JavaOOP01 {

    public static void main(String[] args) {
        Book book = new Book();
        book.add(
                "El hombre duplicado", 
                "José Saramago",
                419
        );
        
        book.get(book);
    }
    
}
