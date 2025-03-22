package LibraryManagementSystem;

import java.util.ArrayList;

//wed are creating a class Library that can hold books record and author record
//for books we are creating an inner class Book, similarly for Authors we are creating author class

public class Library {
//    arraylist
    ArrayList<Book> recordOfBooks = new ArrayList<Book>();
//
    ArrayList<Author> recordOfAuthors = new ArrayList<Author>();

//addBook
    void addBook()
    {

    }
//    displayAllBooks
//    displayBookByAuthor
    void displayAllBooks()
    {

    }
    void displayBookByAuthor()
    {

    }

    class Author
    {
//        authorName
        String authorName;
//        ArrayList : that will hold the records written by the author
        ArrayList<Book> recordsofbookwrittenbytheauthor = new ArrayList<Book>();


    }
    class Book
    {
//        geetanjali
//        title of book, author obj ref, publication year
        String title;
        Author author;
        String publicationYear;




    }
}
