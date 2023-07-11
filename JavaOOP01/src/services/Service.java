package services;

import domain.Book;
import java.util.Scanner;
import java.util.UUID;

public class Service {
    
    public static Book make() {
        Scanner ScanFor = new Scanner(System.in);
        String ISBN = UUID.randomUUID().toString();
     
        System.out.println("Ingrese el título del libro");
        String title = ScanFor.nextLine();
        
        System.out.println("Ingrese el/la autor/a del libro");
        String author = ScanFor.nextLine();
        
        System.out.println("Ingrese la cantidad de páginas del libro");
        int pages = ScanFor.nextInt();
        
        return new Book(title, author, pages, ISBN);
    }
    
    public static void get(Book b) {
        System.out.println(b.toString());
    };
    
}
