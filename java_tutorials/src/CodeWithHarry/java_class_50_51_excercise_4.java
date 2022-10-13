package CodeWithHarry;
import java.util.Scanner;
class library{
    public int count = 0, choice ;
    public String new_book;
    public String [] book_name = new String[10];
    public Scanner scan = new Scanner(System.in);
    public void addBook(){
       if(count<10) {
           System.out.print("enter name of the book :- ");
           new_book = scan.nextLine();
           book_name[count] = new_book;
           System.out.println("book added book number = " +count + " name = "+book_name[count]);
           count++;
       }
       else{
           System.out.println("limit exceed system shutdown ... ");
           System.exit(0);
       }
    }
    public void showAvailableBooks(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("book added book number = " + i + " name = "+book_name[i]);
        }
        main_src();
    }
    public void issueBook(){}
    public void returnBook(){}
    public void main_src(){
        System.out.println("1. addBook");
        System.out.println("2. issueBook");
        System.out.println("3. returnBook");
        System.out.println("4. showAvailableBooks");
        System.out.println("5. Exit");
        System.out.print("enter your choice:- ");
        choice = scan.nextInt();
         switch (choice) {
            case 1 -> addBook();
            case 2 -> issueBook();
            case 3 -> returnBook();
            case 4 -> showAvailableBooks();
            case 5 -> {
                System.out.println("exiting system ...");
                System.exit(0);
            }
        }


    }
    library(){
        while(true) {
            main_src();
        }
    }
}
public class java_class_50_51_excercise_4 {
    public static void main(String[]args) {

        // You have to implement library using Java Class Library
        // Methods:addBook,issueBook,returnBook,showAvailableBooks
        // Properties:Array to store the available books,
        // Array to store the issued books
        library lib = new library();
    }

    }