public class cwh_61_ex4Solution {
    public static void main(String[] args) {
Library1 CentralLibrary = new Library1();
CentralLibrary.addBooks("Rich Dad poor dad");
CentralLibrary.addBooks("C++");
CentralLibrary.addBooks("Python");
CentralLibrary.showAvailableBooks();
CentralLibrary.issuedBook("Rich Dad poor dad");
CentralLibrary.showAvailableBooks();
CentralLibrary.returnBook("C++");
CentralLibrary.showAvailableBooks();

    }
}
class Library1{
    String [] books;
    int no_Of_Books;

    Library1(){
        this.books = new String[100];
        this.no_Of_Books = 0;
    }
    void addBooks(String book){
this.books [no_Of_Books] = book;
no_Of_Books++;
        System.out.println(book+" has been added.");
    }
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for (String book : this.books ) {
            if(book==null){
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void issuedBook(String book) {
        for(int i =0;i<this.books.length;i++) {
                if (this.books[i].equals(book)) {
                    System.out.println("The book has been issued");
                    this.books[i] = null;
                    return;
                }
            }
        System.out.println("This book does not exist");
        }
        void returnBook(String book){
       addBooks(book);
        }
    }

