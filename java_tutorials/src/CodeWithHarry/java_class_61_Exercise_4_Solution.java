package CodeWithHarry;
class Library{
    String[] books;
    int no_of_books, count;
    Library(){
    this.books = new String[100];
        no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        System.out.println(book + " has been added! and book number is " + no_of_books);
        no_of_books++;
    }
    void showAvailableBooks(){
        count = 1;
        System.out.println("Available books are : -");
        for (String book:this.books) {
            if(book==null){
                continue;
            }
            System.out.println("*" + count + ":- " +book);
            count++;
        }
    }
    void issueBook(String book){
        for (int i = 0; i<this.books.length;i++) {
            if(this.books[i].equals(book)){
                System.out.println(" the book has been issued! ");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("this book does not exist ");
    }
    void returnBook(String book){
        System.out.println(book + " book has been returned ");
        addBook(book);

    }
}
public class java_class_61_Exercise_4_Solution {
    // You have to implement library using Java Class Library
    // Methods:addBook,issueBook,returnBook,showAvailableBooks
    // Properties:Array to store the available books,
    // Array to store the issued books
    public static void main(String[] args) {
    Library centalLibrary = new Library();
    centalLibrary.addBook("c#");
    centalLibrary.addBook("python");
    centalLibrary.addBook("java");
    centalLibrary.showAvailableBooks();
    centalLibrary.issueBook("java");
    centalLibrary.showAvailableBooks();
    centalLibrary.returnBook("java");
    centalLibrary.showAvailableBooks();
    }
}
