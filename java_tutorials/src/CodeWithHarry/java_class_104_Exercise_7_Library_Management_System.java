package CodeWithHarry;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;
/**
        Java Exercise 7: Library Management System in Java
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
 **/

public class java_class_104_Exercise_7_Library_Management_System {
    public static Scanner scan = new Scanner(System.in);
    public static Logger logger = Logger.getLogger(java_class_104_Exercise_7_Library_Management_System.class.getName());
    public static ArrayList<String> nameOfBook = new ArrayList<String>();
    public static ArrayList<String> authorOfBook = new ArrayList<String>();
    public static ArrayList<String> issuedTo = new ArrayList<String>();
    public static ArrayList<String> issuedOn = new ArrayList<String>();
    public static ArrayList<String> IssuedBookName = new ArrayList<String>();
    public static ArrayList<String> IssuedBookAuthor = new ArrayList<String>();
    public static int choice, count, BookNumber;
    public static String nameOfTheBook, AuthorOfTheBook;
    public static void display(){
        ElementList();
        System.out.println("1.add book");
        System.out.println("2.return book");
        System.out.println("3.issue book");
        System.out.println("4.display all books");
        System.out.println("5.exit");
        System.out.println("enter choice");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                AddBook();
                break;
            case 2:
                ReturnBook();
                break;
            case 3:
                IssuedBook();
                break;
            case 4:
                DisplayAllBooks();
                break;
            case 5:
                System.out.println("closing program...");
                System.exit(0);
                break;
            default:
                System.out.println("enter valid choice");
                break;
        }
    }
    public static void ElementList(){
        nameOfBook.add("The Hobbit (Paperback)");
        authorOfBook.add("J.R.R. Tolkien");
        nameOfBook.add("Catch-22 (Paperback)");
        authorOfBook.add("Joseph Helle");
        nameOfBook.add("Crime and Punishment");
        authorOfBook.add("Fyodor Dostoevsky");
        nameOfBook.add("lood Meridian, or the Evening Redness in the West ");
        authorOfBook.add("Cormac McCarth");
        nameOfBook.add("The Lord of the Rings");
        authorOfBook.add("J.R.R. Tolkie");
        nameOfBook.add("East of Eden");
        authorOfBook.add("John Steinbec");
        nameOfBook.add("A Gentleman in Moscow");
        authorOfBook.add("Amor Towles");
    }
    public static void AddBook(){
        System.out.print("enter name of the book:- ");
        nameOfTheBook = scan.nextLine();
        nameOfBook.add(nameOfTheBook);
        System.out.print("enter name of the author:- ");
        AuthorOfTheBook = scan.nextLine();
        authorOfBook.add(AuthorOfTheBook);
    }
    public static void ReturnBook(){
        for (int i=0;i<IssuedBookName.size();i++){
            System.out.println(i + "." + " name = " + IssuedBookName.get(i) + " author = " + IssuedBookAuthor.get(i) );
        }
        System.out.println("choose your book number");
        BookNumber = scan.nextInt();
        nameOfTheBook = IssuedBookName.get(BookNumber);
        AuthorOfTheBook = IssuedBookAuthor.get(BookNumber);
        nameOfBook.add(nameOfTheBook);
        authorOfBook.add(AuthorOfTheBook);
        System.out.println("your added book details are ----- name:- " + nameOfTheBook +" author:- " + AuthorOfTheBook);
        IssuedBookName.remove(BookNumber);
        IssuedBookAuthor.remove(BookNumber);
        System.out.println("Thank you, Book Returned Successfully");
    }
    public static void IssuedBook(){
        DisplayAllBooks();
        System.out.println("choose your book number");
        BookNumber = scan.nextInt();
        nameOfTheBook = nameOfBook.get(BookNumber);
        AuthorOfTheBook = authorOfBook.get(BookNumber);
        System.out.println("your book details are ------ name:- "+ nameOfTheBook + " Author:- "+ AuthorOfTheBook);
        IssuedBookName.add(nameOfTheBook);
        IssuedBookAuthor.add(AuthorOfTheBook);
        nameOfBook.remove(BookNumber);
        authorOfBook.remove(BookNumber);
    }
    public static void DisplayAllBooks(){
        for (int i=0;i<nameOfBook.size();i++){
            System.out.println(i + "." + " name = " + nameOfBook.get(i) + " author = " + authorOfBook.get(i) );
        }
    }
    public static void main(String[] args) {
        while(true) {
            display();
        }
    }
}
