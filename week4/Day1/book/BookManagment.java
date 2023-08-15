package Day1.book;

import java.util.ArrayList;
import java.util.List;

public class BookManagment {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Title-1", "Author-1", 2020));
        books.add(new Book("Title-2", "Author-2", 2021));
        books.add(new Book("Title-3", "Author-3", 2022));
        books.add(new Book("Title-4", "Author-4", 2023));

        System.out.println("Title  \t Author  \t Year");
        for(Book b: books){
            if(b.getYearPublished()>2020){

                System.out.println(b.getTitle()+"\t "+b.getAuthor()+"\t "+b.getYearPublished());
            }
        }

    }
}
