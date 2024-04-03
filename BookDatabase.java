/*  TJ Ross
    2/25/24
    Comp 167 Section: 004
    Description: Foundation for maintaining database on books which performs different roles on the collection of books
                
                
 */



import java.util.ArrayList;

public class BookDatabase {

    private ArrayList<Book> books;

    public BookDatabase() {
        this.books = new ArrayList<Book>(); //Arraylist to store books
    
    }

    public BookDatabase(ArrayList<Book> books) {
        this.books = books;  //Default constructor
    }


    public void addBook(Book book) {
        books.add(book);
    }                                   //Add and remove book methods

    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList<Book> search(Author author) {
        ArrayList<Book> sameBooks = new ArrayList<>();
        for (Book bk : books) {
            if (bk.getAuthor().getFirstName().equalsIgnoreCase(author.getFirstName()) &&            //Search for author method
                bk.getAuthor().getLastName().equalsIgnoreCase(author.getLastName())) {      
                sameBooks.add(bk);
            }
        }
        return sameBooks;
    }
    

    public ArrayList<Book> search(int startYear, int endYear) {
        ArrayList<Book> sameBook = new ArrayList<Book>();
        for (Book bk : books) {
            if ((bk.getYear() >= startYear) && (bk.getYear() <= endYear)) {         //Search for year method
                sameBook.add(bk);
            }
        }
        return sameBook;
    }


    public ArrayList<Book> search(String genre) {
        ArrayList<Book> sameBook = new ArrayList<Book>();
        for (Book bk : books) {
            if (bk.getGenre().equals(genre)) {                  //Search for genre method
                sameBook.add(bk);
            }
        }
        return sameBook;
    }
    

    public String toString() {
        String product = "";
        for (Book book : books) {
            product += book.toString();  //Method to return object as string
        }
        return product;

    }

    
    public ArrayList<Book> getBooks() {
        return books;                       //Accesor and mutator methods
    }


    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    


   


















}