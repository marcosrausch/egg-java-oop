package javaoop01;

import domain.Book;
import services.Service;

public class JavaOOP01 {    
        
    static void run() {    
        Book book = Service.make();        
        Service.get(book);
    
    }

    public static void main(String[] args) {
        run();
    }

}
